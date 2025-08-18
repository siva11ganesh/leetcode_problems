package com.streams.example;

public class Managers {

	private int id;
	private String managerName;
	private int empId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Managers(int id, String managerName, int empId) {
		this.id = id;
		this.managerName = managerName;
		this.empId = empId;
	}

}
