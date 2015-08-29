package com.mttr.util;

import java.util.ArrayList;
import java.util.List;

import com.model.Serpo;
import com.mttr.dao.SerpoDAO;

public class Datapool {

	static List<Serpo> serpos;
	static List<String> serposName;
	
	static SerpoDAO serpoDAO = new SerpoDAO();
	
	public static void init(){
		serpos = serpoDAO.retrieve();
	}

	public static List<Serpo> initSerpo() {
		return serpos;
	}
	
	public static List<String> initSerpoName(){
		serposName = new ArrayList<>();
		for (Serpo s : serpos) {
			serposName.add(s.getName());
		}
		return serposName;
	}
}
