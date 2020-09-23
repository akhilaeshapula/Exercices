package com.training.day5.exercise1;

import java.io.Serializable;

public class CreditCardDetails implements Serializable {
	private String cardHolderName;
	private int cardNumber;
	private int creditCard;
	private transient int creditLimt;
	public CreditCardDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreditCardDetails(String cardHolderName, int cardNumber, int creditCard, int creditLimt) {
		super();
		this.cardHolderName = cardHolderName;
		this.cardNumber = cardNumber;
		this.creditCard = creditCard;
		this.creditLimt = creditLimt;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(int creditCard) {
		this.creditCard = creditCard;
	}
	public int getCreditLimt() {
		return creditLimt;
	}
	public void setCreditLimt(int creditLimt) {
		this.creditLimt = creditLimt;
	}
	@Override
	public String toString() {
		return cardHolderName + "," +cardNumber+"," + creditCard;			
	}
	
}