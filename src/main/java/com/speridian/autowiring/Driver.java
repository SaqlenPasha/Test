package com.speridian.autowiring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String args[])
	{
	ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfig.class);
	
	Employee employee=(context.getBean(Employee.class));
	System.out.println("EmpId "+employee.getEmpId());
	System.out.println("EmpName "+employee.getEmpName());
	System.out.println(employee.getPassport().toString());
	
	context.close();
	}
}
