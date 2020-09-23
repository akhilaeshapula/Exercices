package com.training;

import java.io.File;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer ramesh= new Customer("123", "Ramesh",2352763,"ramesh@gmail.com");
		FileHandlingService service = new FileHandlingService();
		service.writeToFile(new File("Customer.txt"),ramesh);
		System.out.println("Done");
		service.readFRomFile(new File("Customer.txt"));
		
		
	}

}
