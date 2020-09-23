package com.training.day6;

import java.io.IOException;

public class Application {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		new InvokeNumberService(100,"Hundred count");
		new InvokeNumberService(10,"ten count");
		new InvokeNumberService(1000,"Thousand count");
		try {
			System.out.println("Enter a message");
			System.in.read();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
