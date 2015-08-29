package com.poc;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.NPOIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import com.model.RawData;

public class ReadExcelData {

	public static List<RawData> getRawData(File file){

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
}
