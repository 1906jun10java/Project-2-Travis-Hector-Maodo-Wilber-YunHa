package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PURCHASEITEM")
public class PurchaseItem {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="purchaseItemSequence")
	@SequenceGenerator(allocationSize=1, name="purchaseItemSequence", sequenceName="SQ_PURCHASEITEM_PK")
	@Column(name="PURCHASE_ID")
	private int purchaseId;
	@Column(name="PRODUCT_ID")
	private int productId;
	@Column(name="PURCHASE_ID")
	private int quantityPurchase;
	@Column(name="PURCHASE_ID")
	private double total;
	
	public PurchaseItem() {
		super();
	}

	public PurchaseItem(int purchaseId, int productId, int quantityPurchase, double total) {
		super();
		this.purchaseId = purchaseId;
		this.productId = productId;
		this.quantityPurchase = quantityPurchase;
		this.total = total;
	}

	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantityPurchase() {
		return quantityPurchase;
	}

	public void setQuantityPurchase(int quantityPurchase) {
		this.quantityPurchase = quantityPurchase;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "PurchaseItem [purchaseId=" + purchaseId + ", productId=" + productId + ", quantityPurchase="
				+ quantityPurchase + ", total=" + total + "]";
	}
}
