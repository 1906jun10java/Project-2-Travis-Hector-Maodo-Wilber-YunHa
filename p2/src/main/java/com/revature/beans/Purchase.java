package com.revature.beans;

import java.util.Date;

public class Purchase {
	
	private int purchaseId;
	private int userId;
	private double total;
	private String nameOfRecipient;
	private String billingAddress;
	private String shippingAddress;
	private Date purchaseDate;
	private String orderStatus;
	
	public Purchase() {
		super();
	}

	public Purchase(int purchaseId, int userId, double total, String nameOfRecipient, String billingAddress,
			String shippingAddress, Date purchaseDate, String orderStatus) {
		super();
		this.purchaseId = purchaseId;
		this.userId = userId;
		this.total = total;
		this.nameOfRecipient = nameOfRecipient;
		this.billingAddress = billingAddress;
		this.shippingAddress = shippingAddress;
		this.purchaseDate = purchaseDate;
		this.orderStatus = orderStatus;
	}

	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
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

	@Override
	public String toString() {
		return "Purchase [purchaseId=" + purchaseId + ", userId=" + userId + ", total=" + total + ", nameOfRecipient="
				+ nameOfRecipient + ", billingAddress=" + billingAddress + ", shippingAddress=" + shippingAddress
				+ ", purchaseDate=" + purchaseDate + ", orderStatus=" + orderStatus + "]";
	}
}
