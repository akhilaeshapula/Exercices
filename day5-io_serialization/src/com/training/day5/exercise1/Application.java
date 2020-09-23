package com.training.day5.exercise1;

import java.io.File;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		CreditCardDetails[] details= new CreditCardDetails[10];
		
		CreditCardDetails ram= new CreditCardDetails("Ram", 2345, 50000);
		CreditCardDetails shyam= new CreditCardDetails("Shyam", 4545, 70000);
		details[0]=ram;
		details[1]=shyam;
		
			CreditCardService service=new CreditCardService();
			boolean result=service.writeObject(details);
			if(result){
				System.out.println("CreditCard persisted");
			}else{
				System.out.println("Error-check");
			}
			
			
		}

}
