package com.springboot.authentication.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AddEmployee {
	
	@JsonIgnore
	private int empId;
	private String empName;
	private String empEmail;

	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpEmail() {
		return empEmail;
	}
	
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
}
