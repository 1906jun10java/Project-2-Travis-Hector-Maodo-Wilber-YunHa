package com.revature.beans;

import java.util.Date;

public class Payment {
	
	private int paymentId;
	private int userId;
	private int cardNumber;
	private String nameOnCard;
	private Date expirationDate;
	private int securityCode;
	private String cardType;
	
	public Payment() {
		super();
	}

	public Payment(int paymentId, int userId, int cardNumber, String nameOnCard, Date expirationDate, int securityCode,
			String cardType) {
		super();
		this.paymentId = paymentId;
		this.userId = userId;
		this.cardNumber = cardNumber;
		this.nameOnCard = nameOnCard;
		this.expirationDate = expirationDate;
		this.securityCode = securityCode;
		this.cardType = cardType;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public int getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(int securityCode) {
		this.securityCode = securityCode;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", userId=" + userId + ", cardNumber=" + cardNumber + ", nameOnCard="
				+ nameOnCard + ", securityCode=" + securityCode + ", cardType=" + cardType + "]";
	}
}
