package com.model;

import java.util.Date;

public class RawData {

	String serpo;
	String company;
	String type;
	String region;
	Date recoveryDate;
	Date periodeRecoveryDate;
	String problem;
	int months;
	int year;
	int recoveryTime;
	
	public RawData() {
	}
	
	public String getSerpo() {
		return serpo;
	}
	public void setSerpo(String serpo) {
		this.serpo = serpo;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Date getRecoveryDate() {
		return recoveryDate;
	}
	public void setRecoveryDate(Date recoveryDate) {
		this.recoveryDate = recoveryDate;
	}
	public Date getPeriodeRecoveryDate() {
		return periodeRecoveryDate;
	}
	public void setPeriodeRecoveryDate(Date periodeRecoveryDate) {
		this.periodeRecoveryDate = periodeRecoveryDate;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public int getMonths() {
		return months;
	}
	public void setMonths(int months) {
		this.months = months;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getRecoveryTime() {
		return recoveryTime;
	}
	public void setRecoveryTime(int recoveryTime) {
		this.recoveryTime = recoveryTime;
	}
}
