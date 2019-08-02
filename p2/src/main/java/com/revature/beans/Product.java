package com.revature.beans;

public class Product {
	
	private int productId;
	private int memeId;
	private String productName;
	private String productDescription;
	private String productType;
	private String color;
	private String gender;
	private String size;
	private double price;
	private int quantity;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, int memeId, String productName, String productDescription, String productType,
			String color, String gender, String size, double price, int quantity) {
		super();
		this.productId = productId;
		this.memeId = memeId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productType = productType;
		this.color = color;
		this.gender = gender;
		this.size = size;
		this.price = price;
		this.quantity = quantity;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getMemeId() {
		return memeId;
	}

	public void setMemeId(int memeId) {
		this.memeId = memeId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", memeId=" + memeId + ", productName=" + productName
				+ ", productDescription=" + productDescription + ", productType=" + productType + ", color=" + color
				+ ", gender=" + gender + ", size=" + size + ", price=" + price + ", quantity=" + quantity + "]";
	}
}
