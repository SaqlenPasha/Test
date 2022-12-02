package com.speridian.AOP;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
		public static void main(String args[])
		{
			ApplicationContext context= new AnnotationConfigApplicationContext(AopConfig.class);
			EasyBank bank=context.getBean(EasyBank.class);
			
			Scanner scanner=new Scanner(System.in);
			int choice=0;
			int pin=0;
			int amount=0;
			
			do {
				System.out.println("\nSelect option \n 1.Deposite\n 2.Withdraw \n 3.Change Pin \n 4.Show Balance \n 5.Exit" );
				choice = scanner.nextInt();
				try {
					switch(choice) {
					case 1:{
						System.out.println("Enter the ampunt to deposit");
						amount=scanner.nextInt();
						System.out.println("Enter Pin");
						
						pin=scanner.nextInt();
						bank.setTempPin(pin);
						bank.doDeposit(amount);
						break;
					}
					case 2:{
						System.out.println("Enter the ampunt to withdraw");
						amount=scanner.nextInt();
						System.out.println("Enter Pin");
						pin=scanner.nextInt();
						bank.setTempPin(pin);
						bank.doWithdraw(amount);
						break;
					}
					case 3:{
						System.out.println("ENter your current pin");
						int oldPin=scanner.nextInt();
						System.out.println("Enter 4 digit new pin");
						pin=scanner.nextInt();
						bank.doChangePin(oldPin, pin);
						break;
					}
					case 4:{
						System.out.println("Enter the pin");
						pin=scanner.nextInt();
						bank.setTempPin(pin);
						bank.showBalance();
						break;
					}
					case 5:{
						System.out.println("Thanks for using our service");
						break;
					}
					default:{
						System.out.println("Wrong Choice");
					}
					}
				}
				catch(Exception ignore) {					
				}
				
			}while(choice!=5);	
		}
}
