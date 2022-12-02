package com.speridian.lifeCylce;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInitDestroy {

	public static void main(String args[])
	{
		AbstractApplicationContext appContext= new ClassPathXmlApplicationContext("BeanLifecycle.xml");
		Country countryObj=(Country) appContext.getBean("country");
		
		System.out.println("Country Name: "+countryObj.getCountryName());
		appContext.registerShutdownHook();
	}
}
