package com.revature.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	
	@OneToOne
	@JoinColumn(name="USER_ID", referencedColumnName = "USER_ID")
	private User user;
	
	@Column(name="CARD_NUMBER")
	private int cardNumber;
	
	@Column(name="NAME_ON_CARD")
	private String nameOnCard;
	
	@Column(name="EXPIRATION_DATE")
	private Date expirationDate;
	
	@Column(name="SECURITY_CODE")
	private int securityCode;
	
	public Payment() {
		super();
	}

	public Payment(User user, int cardNumber, String nameOnCard, Date expirationDate, int securityCode) {
		super();
		this.user = user;
		this.cardNumber = cardNumber;
		this.nameOnCard = nameOnCard;
		this.expirationDate = expirationDate;
		this.securityCode = securityCode;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", user=" + user + ", cardNumber=" + cardNumber + ", nameOnCard="
				+ nameOnCard + ", expirationDate=" + expirationDate + ", securityCode=" + securityCode + "]";
	}

	
}
