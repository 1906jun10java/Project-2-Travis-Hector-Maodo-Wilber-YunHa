package com.revature.beans;

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
@Table(name="PURCHASEITEM")
public class PurchaseItem {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="purchaseItemSequence")
	@SequenceGenerator(allocationSize=1, name="purchaseItemSequence", sequenceName="SQ_PURCHASEITEM_PK")
	@Column(name="PURCHASE_ITEM_ID")
	private int purchaseItemId;
	
	@OneToOne
	@JoinColumn(name="PRODUCT_ID", referencedColumnName="PRODUCT_ID")
	private Product product;
	
	@OneToOne
	@JoinColumn(name="PURCHASE_ID", referencedColumnName="PURCHASE_ID")
	private Purchase purchase;
	
	@Column(name="QUANTITY")
	private int quantityPurchased;
	
	@Column(name="TOTAL")
	private double total;
	
	public PurchaseItem() {
		super();
	}

	public PurchaseItem(int purchaseItemId, Product product, Purchase purchase, int quantityPurchased, double total) {
		super();
		this.purchaseItemId = purchaseItemId;
		this.product = product;
		this.purchase = purchase;
		this.quantityPurchased = quantityPurchased;
		this.total = total;
	}
	
	public PurchaseItem(Product product, Purchase purchase, int quantityPurchased, double total) {
		super();
		this.product = product;
		this.purchase = purchase;
		this.quantityPurchased = quantityPurchased;
		this.total = total;
	}

	public int getPurchaseItemId() {
		return purchaseItemId;
	}

	public void setPurchaseItemId(int purchaseItemId) {
		this.purchaseItemId = purchaseItemId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Purchase getPurchase() {
		return purchase;
	}

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

	public int getQuantityPurchased() {
		return quantityPurchased;
	}

	public void setQuantityPurchased(int quantityPurchased) {
		this.quantityPurchased = quantityPurchased;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "PurchaseItem [purchaseItemId=" + purchaseItemId + ", product=" + product + ", purchase=" + purchase
				+ ", quantityPurchased=" + quantityPurchased + ", total=" + total + "]";
	}

	
}
