package com.training.example.two;

import com.training.ifaces.Automobile;

public class Tractor implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Black";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Mahindra";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 600000;
	}

}
