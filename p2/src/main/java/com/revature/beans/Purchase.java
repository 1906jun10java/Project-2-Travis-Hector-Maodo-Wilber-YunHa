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
@Table(name="PURCHASE")
public class Purchase {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="purchaseSequence")
	@SequenceGenerator(allocationSize=1, name="purchaseSequence", sequenceName="SQ_PURCHASE_PK")
	@Column(name="PURCHASE_ID")
	private int purchaseId;
	
	@OneToOne
	@JoinColumn(name="USER_ID", referencedColumnName = "USER_ID")
	private User user;
	
	@Column(name="TOTAL")
	private double total;
	
	@Column(name="NAME_OF_RECIPIENT")
	private String nameOfRecipient;
	
	@OneToOne
	@JoinColumn(name="PAYMENT_ID", referencedColumnName="PAYMENT_ID")
	private Payment payment;
	
	@OneToOne
	@JoinColumn(name="BILLING_ADDRESS", referencedColumnName="ADDRESS_ID")
	private Address billingAddress;
	
	@OneToOne
	@JoinColumn(name="SHIPPING_ADDRESS", referencedColumnName="ADDRESS_ID")
	private Address shippingAddress;
	
	@Column(name="PURCHASE_DATE")
	private Date purchaseDate;
	
	@Column(name="ORDER_STATUS")
	private String orderStatus;
	
	@Column(name="EMAIL")
	private String email;
	
	public Purchase() {
		super();
	}

	public Purchase(int purchaseId, User user, double total, String nameOfRecipient, String email, Payment payment,
			Address billingAddress, Address shippingAddress, Date purchaseDate, String orderStatus) {
		super();
		this.purchaseId = purchaseId;
		this.user = user;
		this.total = total;
		this.nameOfRecipient = nameOfRecipient;
		this.email = email;
		this.payment = payment;
		this.billingAddress = billingAddress;
		this.shippingAddress = shippingAddress;
		this.purchaseDate = purchaseDate;
		this.orderStatus = orderStatus;
	}
	
	public Purchase(User user, double total, String nameOfRecipient, String email, Payment payment, Address billingAddress, 
			Address shippingAddress, Date purchaseDate, String orderStatus) {
		super();
		this.user = user;
		this.total = total;
		this.nameOfRecipient = nameOfRecipient;
		this.email = email;
		this.payment = payment;
		this.billingAddress = billingAddress;
		this.shippingAddress = shippingAddress;
		this.purchaseDate = purchaseDate;
		this.orderStatus = orderStatus;
	}
	
	public Purchase(double total, String nameOfRecipient, String email, Payment payment, Address billingAddress, 
			Address shippingAddress, Date purchaseDate, String orderStatus) {
		super();
		this.total = total;
		this.nameOfRecipient = nameOfRecipient;
		this.email = email;
		this.payment = payment;
		this.billingAddress = billingAddress;
		this.shippingAddress = shippingAddress;
		this.purchaseDate = purchaseDate;
		this.orderStatus = orderStatus;
	}
	
	public Purchase(User user, double total, Payment payment, Address shippingAddress, Date purchaseDate) {
		super();
		this.user = user;
		this.total = total;
		this.payment = payment;
		this.shippingAddress = shippingAddress;
		this.purchaseDate = purchaseDate;
	}


	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getNameOfRecipient() {
		return nameOfRecipient;
	}

	public void setNameOfRecipient(String nameOfRecipient) {
		this.nameOfRecipient = nameOfRecipient;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Purchase [purchaseId=" + purchaseId + ", user=" + user + ", total=" + total + ", nameOfRecipient="
				+ nameOfRecipient + ", payment=" + payment + ", billingAddress=" + billingAddress + ", shippingAddress="
				+ shippingAddress + ", purchaseDate=" + purchaseDate + ", orderStatus=" + orderStatus + ", email="
				+ email + "]";
	}
	
}
