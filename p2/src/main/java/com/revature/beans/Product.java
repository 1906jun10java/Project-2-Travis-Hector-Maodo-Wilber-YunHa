
package com.revature.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity

@Table(name = "PRODUCT")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "productSequence")
	@SequenceGenerator(allocationSize = 1, name = "productSequence", sequenceName = "SQ_PRODUCT_PK")
	@Column(name = "PRODUCT_ID")
	private int productId;

	@Column(name = "PRODUCT_NAME")
	private String productName;
	
	@Column(name = "PRODUCT_TYPE")
	private String productType;

	@Column(name = "PRODUCT_DESCRIPTION")
	private String productDescription;
	
	@Column(name = "PRODUCT_IMAGE")
	private String imageURL;
	
	@Column(name = "PRODUCT_GENDER")
	private String gender;
	
	@Column(name = "PRODUCT_COLOR")
	private String color;

	@Column(name = "PRODUCT_SIZE")
	private String size;

	@Column(name = "PRODUCT_PRICE")
	private double price;

	@Column(name = "PRODUCT_QUANTITY")
	private int quantity;
	
	@Column(name = "PRODUCT_APPERAL")
	private String apparel;
	
	@Column(name = "PRODUCT_COLLECTION")
	private String collection;

	public Product() {
		super();
	}

	public Product(String productName, String productType, String productDescription, String imageURL, String gender,
			String color, String size, double price, int quantity, String apparel, String collection) {
		super();
		this.productName = productName;
		this.productType = productType;
		this.productDescription = productDescription;
		this.imageURL = imageURL;
		this.gender = gender;
		this.color = color;
		this.size = size;
		this.price = price;
		this.quantity = quantity;
		this.apparel = apparel;
		this.collection = collection;
	}



	public Product(int productId, String productName, String productType, String productDescription, String imageURL,
			String gender, String color, String size, double price, int quantity, String apparel, String collection) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.productDescription = productDescription;
		this.imageURL = imageURL;
		this.gender = gender;
		this.color = color;
		this.size = size;
		this.price = price;
		this.quantity = quantity;
		this.apparel = apparel;
		this.collection = collection;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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

	public String getApparel() {
		return apparel;
	}

	public void setApparel(String apparel) {
		this.apparel = apparel;
	}

	public String getCollection() {
		return collection;
	}

	public void setCollection(String collection) {
		this.collection = collection;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productType=" + productType
				+ ", productDescription=" + productDescription + ", imageURL=" + imageURL + ", gender=" + gender
				+ ", color=" + color + ", size=" + size + ", price=" + price + ", quantity=" + quantity + ", apparel="
				+ apparel + ", collection=" + collection + "]";
	}

}
