package com.virtusa.bean;

public class Employee {

	private String empName;

	private String empCode;

	private Address address;

	private Unit unit;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	
	public void employeeDetails() {
		System.out.println("Employee Name: "+this.getEmpName());
		System.out.println("Employee Code: "+this.getEmpCode());
		System.out.println("Employee Unit: "+this.getUnit());
		System.out.println("Employee Address: "+this.getAddress());
	}

}
