package com.training.day6;

public class NumberService {

	public void sumNumbers(int countTo){
		int count=0;
		for(int i=0;i<countTo;i++){
			count+=i;
		}
		System.out.println("Sum upto"+countTo+"ïs="+count+" called by"+Thread.currentThread().getName());
	}
 }
