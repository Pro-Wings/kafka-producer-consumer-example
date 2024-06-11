package com.prowings.kafka_producer_api.model;

public class Employee {
	
	private int empId;
	private String ename;
	private String eaddress;
	
	public Employee() {
		super();
	}
	
	public Employee(int empId, String ename, String eaddress) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.eaddress = eaddress;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", eaddress=" + eaddress + "]";
	}
	
	

}
