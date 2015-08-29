package com.mttr.dao;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Serpo;
import com.mttr.util.ConnectionManager;
import com.mttr.util.DAO;

public class SerpoDAO implements DAO<Serpo>{

	List<Serpo> listSerpo;
	Serpo serpo;
	Statement stmt;
	
	ResultSet rs;
	
	String SQL = "select * from serpo";
	
	@Override
	public List<Serpo> retrieve() {
		listSerpo = new ArrayList<>();
		try {
			stmt = ConnectionManager.init();
			rs = stmt.executeQuery(SQL);
			while (rs.next()) {
				serpo = new Serpo();
				serpo.setId(rs.getInt("ID"));
				serpo.setName(rs.getString("NAME"));
				listSerpo.add(serpo);
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
		return listSerpo;
	}

	@Override
	public List<Serpo> retrieve(String SQL) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Serpo get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(List<String> list) {
		// TODO Auto-generated method stub
		
	}

}
