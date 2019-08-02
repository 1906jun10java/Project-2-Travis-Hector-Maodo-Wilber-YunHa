package com.revature.beans;

public class PurchaseItem {
	
	private int purchaseId;
	private int productId;
	private int quantityPurchase;
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
