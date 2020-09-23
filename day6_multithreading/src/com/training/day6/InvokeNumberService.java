package com.training.day6;

public class InvokeNumberService implements Runnable {

//	setting the parameters from the main method here
	private NumberService service;
	private int countTo;
	private String threadName;
	
	
	public InvokeNumberService(int countUpto,String threadName) {
		super();
//		creating instance of service
		this.service=new NumberService();
		this.countTo=countUpto;
//		passing the service instance which is runnable to the thread along with the name of the arguments
		this.threadName=threadName;
		Thread thread=new Thread(this, threadName);
//		calling the start method which makes the thread eligible for running
		thread.start();
	}

	@Override
	public void run() {

//		calling the code that has to be executed in a thread
//		indirectly adding a piece of code to run method instead of adding it direvctly
//		I have created a class and called it here
		this.service.sumNumbers(countTo);
		

	}

}
