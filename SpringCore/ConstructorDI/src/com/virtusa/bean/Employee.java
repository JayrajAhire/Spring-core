package com.virtusa.bean;

public class Employee {

	private String empName;

	private String empCode;

	private Address address;

	private Unit unit;

	public Employee(String empName, String empCode, Address address, Unit unit) {
		super();
		this.empName = empName;
		this.empCode = empCode;
		this.unit = unit;
		this.address = address;
	}
	
	public void employeeDetails() {
		System.out.println("Employee Name: "+this.empName);
		System.out.println("Employee Code: "+this.empCode);
		System.out.println("Employee Unit: "+this.address);
		System.out.println("Employee Address: "+this.unit);
	}

}
