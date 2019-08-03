package com.revature.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PAYMENT")
public class Payment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="paymentSequence")
	@SequenceGenerator(allocationSize=1, name="paymentSequence", sequenceName="SQ_PAYMENT_PK")
	@Column(name="PAYMENT_ID")
	private int paymentId;
	@Column(name="USER_ID")
	private int userId;
	@Column(name="CARD_NUMBER")
	private int cardNumber;
	@Column(name="NAME_ON_CARD")
	private String nameOnCard;
	@Column(name="EXPIRATION_DATE")
	private Date expirationDate;
	@Column(name="SECURITY_CODE")
	private int securityCode;
	@Column(name="CARD_TYPE")
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
