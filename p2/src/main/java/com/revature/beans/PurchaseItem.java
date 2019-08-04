/*
 * package com.revature.beans;
 * 
 * import java.io.Serializable;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity;
 * 
 * import javax.persistence.Id; import javax.persistence.JoinColumn; import
 * javax.persistence.ManyToOne; import javax.persistence.Table;
 * 
 * @Entity
 * 
 * @Table(name="PURCHASEITEM") public class PurchaseItem implements
 * Serializable{
 * 
 * private static final long serialVersionUID = 5970484661223424986L;
 * 
 * @Id
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name="PRODUCT_ID") private Product product;
 * 
 * @Id
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name="PURCHASE_ID") private Purchase purchase;
 * 
 * @Column(name="QUANTITY_ID") private int quantityPurchase;
 * 
 * @Column(name="TOTAL") private double total;
 * 
 * public PurchaseItem() { super(); }
 * 
 * public PurchaseItem(int purchaseId, int productId, int quantityPurchase,
 * double total) { super(); this.quantityPurchase = quantityPurchase; this.total
 * = total; }
 * 
 * public int getQuantityPurchase() { return quantityPurchase; }
 * 
 * public void setQuantityPurchase(int quantityPurchase) { this.quantityPurchase
 * = quantityPurchase; }
 * 
 * public double getTotal() { return total; }
 * 
 * public void setTotal(double total) { this.total = total; }
 * 
 * @Override public String toString() { return "PurchaseItem [quantityPurchase="
 * + quantityPurchase + ", total=" + total + "]"; } }
 */