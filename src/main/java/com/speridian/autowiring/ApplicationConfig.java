package com.speridian.autowiring;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ApplicationConfig {

	
	@Bean
	public Employee employee() {
		Employee e= new Employee(); 
		//Setter Based Injection
		e.setEmpId(1234);
		e.setEmpName("Steve George");
		
		//e.setPassport(passObj); is not required as it is Autowired
		
		return e;
	}
	@Bean
	public Passport passport()
	{
		Passport passport=new Passport();
		
		Date todayDate=new Date();
		
		Calendar cal=Calendar.getInstance();
		cal.setTime(todayDate);
		
		cal.add(Calendar.DATE, 84);
		
		Date expiryDate=cal.getTime();
		
		passport.setPassNum(9876);
		//Below setters can not be used in an xml as they are dynamic.
		passport.setDateOfIssue(todayDate);
		passport.setDateOfExpiry(expiryDate);
		
		return passport;
	}
}
