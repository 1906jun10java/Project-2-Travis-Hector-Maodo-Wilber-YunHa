/*
 * package com.revature.beans;
 * 
 * import java.util.Date;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
 * import javax.persistence.Id; import javax.persistence.SequenceGenerator;
 * import javax.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name="PURCHASE") public class Purchase {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy=GenerationType.AUTO, generator="purchaseSequence")
 * 
 * @SequenceGenerator(allocationSize=1, name="purchaseSequence",
 * sequenceName="SQ_PURCHASE_PK")
 * 
 * @Column(name="PURCHASE_ID") private int purchaseId;
 * 
 * @Column(name="USER_ID") private int userId;
 * 
 * @Column(name="TOTAL") private double total;
 * 
 * @Column(name="NAME_OF_RECIPIENT") private String nameOfRecipient;
 * 
 * @Column(name="BILLING_ADDRESS") private String billingAddress;
 * 
 * @Column(name="SHIPPING_ADDRESS") private String shippingAddress;
 * 
 * @Column(name="PURCHASE_DATE") private Date purchaseDate;
 * 
 * @Column(name="ORDER_STATUS") private String orderStatus;
 * 
 * public Purchase() { super(); }
 * 
 * public Purchase(int purchaseId, int userId, double total, String
 * nameOfRecipient, String billingAddress, String shippingAddress, Date
 * purchaseDate, String orderStatus) { super(); this.purchaseId = purchaseId;
 * this.userId = userId; this.total = total; this.nameOfRecipient =
 * nameOfRecipient; this.billingAddress = billingAddress; this.shippingAddress =
 * shippingAddress; this.purchaseDate = purchaseDate; this.orderStatus =
 * orderStatus; }
 * 
 * public int getPurchaseId() { return purchaseId; }
 * 
 * public void setPurchaseId(int purchaseId) { this.purchaseId = purchaseId; }
 * 
 * public int getUserId() { return userId; }
 * 
 * public void setUserId(int userId) { this.userId = userId; }
 * 
 * public double getTotal() { return total; }
 * 
 * public void setTotal(double total) { this.total = total; }
 * 
 * public String getNameOfRecipient() { return nameOfRecipient; }
 * 
 * public void setNameOfRecipient(String nameOfRecipient) { this.nameOfRecipient
 * = nameOfRecipient; }
 * 
 * public String getBillingAddress() { return billingAddress; }
 * 
 * public void setBillingAddress(String billingAddress) { this.billingAddress =
 * billingAddress; }
 * 
 * public String getShippingAddress() { return shippingAddress; }
 * 
 * public void setShippingAddress(String shippingAddress) { this.shippingAddress
 * = shippingAddress; }
 * 
 * public Date getPurchaseDate() { return purchaseDate; }
 * 
 * public void setPurchaseDate(Date purchaseDate) { this.purchaseDate =
 * purchaseDate; }
 * 
 * public String getOrderStatus() { return orderStatus; }
 * 
 * public void setOrderStatus(String orderStatus) { this.orderStatus =
 * orderStatus; }
 * 
 * @Override public String toString() { return "Purchase [purchaseId=" +
 * purchaseId + ", userId=" + userId + ", total=" + total + ", nameOfRecipient="
 * + nameOfRecipient + ", billingAddress=" + billingAddress +
 * ", shippingAddress=" + shippingAddress + ", purchaseDate=" + purchaseDate +
 * ", orderStatus=" + orderStatus + "]"; } }
 */
