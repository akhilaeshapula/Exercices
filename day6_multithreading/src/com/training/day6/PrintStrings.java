package com.training.day6;

public class PrintStrings {

	public static void print(String str1,String str2){
		System.out.println(str1);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println(str2);
	}
}
