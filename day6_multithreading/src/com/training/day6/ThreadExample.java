package com.training.day6;

import java.io.IOException;

public class ThreadExample {
	public void main(String[]args){
		System.out.println("Main thread starts");
		Thread thread=new Thread(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Joining thread starts");
				try {
					System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Joining thread will be completing");
				
			}
			
			
		};
		
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main finished");
	}

}
