package com.virtusa.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.virtusa.bean.Address;
import com.virtusa.bean.Employee;
import com.virtusa.bean.Unit;

public class Test {
	
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("SpringBeans.xml");
		Employee emp = (Employee) ctx.getBean("employee");
		
		System.out.println("Initialize a bean with two dependent beans using Constructor DI and XML config.....");
		emp.employeeDetails();
		
		System.out.println("*****************************");
		System.out.println("Initialize a bean with two dependent beans using Constructor DI and Java config.....");
		Employee emp1 = new Employee("Akanksha","002",new Address("Satana", "Maharashtra", "India"), new Unit("HealthCare"));
		emp1.employeeDetails();
		
	}

}
