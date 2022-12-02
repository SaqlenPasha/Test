package com.sperdian.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
public static void main(String args[])
{
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	MemberShip ms=(MemberShip) context.getBean("membershipObj2");
	
	System.out.println(ms);
}
}
