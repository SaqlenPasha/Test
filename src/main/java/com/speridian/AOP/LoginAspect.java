package com.speridian.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspect {
	private EasyBank easyBank;
	
	public EasyBank getEasyBank() {
		return easyBank;
	}
	@Autowired
	public void setEasyBank(EasyBank easyBank) {
		this.easyBank=easyBank;
	}
	@Around(value="execution(public void com.speridian.AOP.EasyBank.doWithdraw(..))")
	public void validateWithdraw(ProceedingJoinPoint joinPoint) throws Throwable{
		if(easyBank.getTempPin()!=easyBank.getPinCode())
		{	
			throw new Exception();
		}
		else
		{
			//proceed with the next advice or target method
			joinPoint.proceed();
			System.out.println("Your remaining balance is "+(easyBank.getBalance()));
		}
	}
	 @Before("execution(public void com.speridian.AOP.EasyBank.showBalance(..)) ||"
	 		+ " " +"execution(public void com.speridian.AOP.EasyBank.doDeposit(..))")
	public void validateBalance() {
		if(easyBank.getTempPin()!=easyBank.getPinCode())
		{
			throw new RuntimeException();
		}
	}
	
	@AfterReturning(value = "execution(public void com.speridian.AOP.EasyBank.doChangePin(..))")
	public void afterPinCHange() {
		System.out.println("You have successfully changed your pin");
	}
	
	@AfterThrowing(value="within(com.speridian.AOP.EasyBank)")
	public void afterWrongPin() {
		System.out.println("Invalid Pin");
	}
}
