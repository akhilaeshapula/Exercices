package com.training;

import javax.management.RuntimeErrorException;

import com.training.exceptions.RangeCheckExceptions;

public class Customer {
	private String customerid;
	private String customerName;
	private long mobileNumber;
	private String email;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerid, String customerName, long mobileNumber, String email) {
		super();
		this.customerid = customerid;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber)throws RangeCheckExceptions{
		if(mobileNumber<0 || mobileNumber>99999){
			throw new RangeCheckExceptions("�nvalid mobile number");	
		}
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customerName=" + customerName + ", mobileNumber="
				+ mobileNumber + ", email=" + email + "]";
	}
	
}
