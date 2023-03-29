package com.virtusa.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.virtusa.bean.Employee;
import com.virtusa.bean.Unit;


//Initialize a bean with two dependent beans using setter DI


public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("SpringBeans.xml");
		Employee emp = (Employee) ctx.getBean("employee");
		
		System.out.println("Initialize a bean with two dependent beans using setter DI and XML config.....");
		emp.employeeDetails();
		
		
		System.out.println("***********");
		System.out.println("Initialize a bean with two dependent beans using setter DI and Java config.....");
		emp.setEmpName("Jayraj");
		emp.setEmpCode("002");
		emp.getUnit().setUnitName("Telecom");;
		emp.getAddress().setCity("Satana");;
		emp.getAddress().setCountry("India");
		emp.getAddress().setState("Maharastra");
		emp.employeeDetails();
		
		ctx.close();

	}

}
