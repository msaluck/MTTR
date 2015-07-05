package com.main;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.RawData;
import com.util.ConnectionManager;
import com.util.DAO;

public class InsertData implements DAO<RawData>{
	Statement stmt;
	ResultSet rs;
	List<RawData> rawDatas;
	RawData rawData;
	String SQL = "SELECT * FROM MTTR";

	@Override
	public List<RawData> retrieve() {
		rawDatas = new ArrayList<>();
		try {
			stmt = ConnectionManager.init();
			rs = stmt.executeQuery(SQL);
			while (rs.next()) {
				rawData = new RawData();
				rawData.setSerpo(rs.getString("SERPO"));
				rawData.setCompany(rs.getString("COMPANY"));
				rawData.setType(rs.getString("TYPE"));
				rawData.setRegion(rs.getString("REGION"));
				rawData.setRecoveryDate(rs.getDate("RECOVERY_DATE"));
				rawData.setPeriodeRecoveryDate(rs.getDate("PERIODE_RECOVERY_DATE"));
				rawData.setProblem(rs.getString("PROBLEM"));
				rawData.setMonths(rs.getInt("MONTHS"));
				rawData.setYear(rs.getInt("YEAR"));
				rawData.setRecoveryTime(rs.getInt("RECOVERY_TIME"));
				rawDatas.add(rawData);
			}
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ConnectionManager.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rawDatas;
	}

	@Override
	public RawData get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(List<String> list) {
		try {
			stmt = ConnectionManager.init();
			for (String string : list) {
				stmt.executeQuery(string);
			}
		} catch (IOException | SQLException e) {
			e.printStackTrace();
		}
	}
}
