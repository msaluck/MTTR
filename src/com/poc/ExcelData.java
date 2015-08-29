package com.poc;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.NPOIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import com.model.RawData;
import com.mttr.dao.RawDataDAO;

public class ExcelData {

	public static List<RawData> getRawDataFromExcel(File file){

		List<RawData> rawDatas = new ArrayList<>();

		RawData rawData;

		NPOIFSFileSystem fs = null;

		HSSFWorkbook wb = null;

		Sheet sheet1;

		int countRow;

		try {
			fs = new NPOIFSFileSystem(file);
			wb = new HSSFWorkbook(fs.getRoot(), true);
			sheet1 = wb.getSheetAt(0);
			countRow = 0;
			for (Row row : sheet1) {
				rawData = new RawData();
				countRow = countRow+1;
				for (Cell cell : row) {
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_STRING:
						if (cell.getColumnIndex()==1) rawData.setSerpo(cell.getRichStringCellValue().getString());
						if (cell.getColumnIndex()==2) rawData.setCompany(cell.getRichStringCellValue().getString());
						if (cell.getColumnIndex()==3) rawData.setType(cell.getRichStringCellValue().getString());
						if (cell.getColumnIndex()==4) rawData.setRegion(cell.getRichStringCellValue().getString());
						if (cell.getColumnIndex()==7) rawData.setProblem(cell.getRichStringCellValue().getString());
						break;
					case Cell.CELL_TYPE_NUMERIC:
						if (DateUtil.isCellDateFormatted(cell)) {
							if (cell.getColumnIndex()==5) rawData.setRecoveryDate(cell.getDateCellValue());
							if (cell.getColumnIndex()==6) rawData.setPeriodeRecoveryDate(cell.getDateCellValue());
						} else {
							if (cell.getColumnIndex()==8) rawData.setMonths((int) cell.getNumericCellValue());
							if (cell.getColumnIndex()==9) rawData.setYear((int) cell.getNumericCellValue());
							if (cell.getColumnIndex()==10) rawData.setRecoveryTime((int) cell.getNumericCellValue());
						}
						break;
					case Cell.CELL_TYPE_BOOLEAN:
						break;
					case Cell.CELL_TYPE_FORMULA:
						if (cell.getColumnIndex()==8) rawData.setMonths((int) cell.getNumericCellValue());
						if (cell.getColumnIndex()==9) rawData.setYear((int) cell.getNumericCellValue());
						
						break;
					default:
					}
				}
				rawDatas.add(rawData);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(fs != null) fs.close();
				if(wb != null) wb.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return rawDatas;
	}

	public static List<String> processingRawData(List<RawData> rawDatas){
		String s = "insert into MTTR (serpo,company,type,region,recovery_date,periode_recovery_date,problem,months,year,recovery_time) values ('$serpo', '$company', '$type', '$region', '$recoveryDate', '$periodeRecoveryDate', '$problem', $months, $year, $recoveryTime)";

		List<String> result = new ArrayList<>();
		for (RawData data : rawDatas) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Velocity.init(); 
			VelocityContext context = new VelocityContext();
			StringWriter w = new StringWriter();
			context.put("serpo", data.getSerpo());
			context.put("company", data.getCompany());
			context.put("type", data.getType());
			context.put("region", data.getRegion());
			context.put("recoveryDate", sdf.format(data.getRecoveryDate()));
			context.put("periodeRecoveryDate", sdf.format(data.getPeriodeRecoveryDate()));
			context.put("problem", data.getProblem());
			context.put("months", data.getMonths());
			context.put("year", data.getYear());
			context.put("recoveryTime", data.getRecoveryTime());
			Velocity.evaluate(context,w,"test",s);
			result.add(w.toString());
		}
		return result;
	}
	
	public static void insertData(File file){
		RawDataDAO rawDataDAO = new RawDataDAO();
		rawDataDAO.insert(processingRawData(getRawDataFromExcel(file)));
	}
}
