package com.speridian.app;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("Bean2.xml");
		Customer custObj1=(Customer) ctx.getBean("custObj");
		
		custObj1.getAddress().setCity("Greenville");
		
		System.out.println("Customer City of first Customer: "+custObj1.getAddress().getCity());
		
		Customer custObj2=(Customer) ctx.getBean("custObj");
		System.out.println("Default customer city of second Customer: "+custObj2.getAddress().getCity());          //default scope is singleton
	}

}
