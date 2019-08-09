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
@Table(name="PRODUCT")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="productSequence")
	@SequenceGenerator(allocationSize=1, name="productSequence", sequenceName="SQ_PRODUCT_PK")
	@Column(name="PRODUCT_ID")
	private int productId;
	
	@OneToOne
	@JoinColumn(name="MEME_ID", referencedColumnName = "MEME_ID")
	private Meme meme;
	
	@Column(name="PRODUCT_NAME")
	private String productName;
	
	@Column(name="PRODUCT_DESCRIPTION")
	private String productDescription;
	
	@Column(name="PRODUCT_TYPE")
	private String productType;
	
	@Column(name="PRODUCT_COLOR")
	private String color;
	
	@Column(name="PRODUCT_GENDER")
	private String gender;
	
	@Column(name="PRODUCT_SIZE")
	private String size;
	
	@Column(name="PRODUCT_PRICE")
	private double price;
	
	@Column(name="PRODUCT_QUANTITY")
	private int quantity;
	
	@Column(name="NUMBER_SOLD")
	private int numberSold;
	
	@Column(name="QUANTITY_IN_CART")
	private int quantityInCart;
	
	@OneToOne
	@JoinColumn(name="PURCHASE_ID", referencedColumnName = "PURCHASE_ID")
	private Purchase purchase;
	
	public Product() {
		super();
	}

	public Product(int productId, Meme meme, String productName, String productDescription, String productType,
			String color, String gender, String size, double price, int quantity, int numberSold, int quantityInCart,
			Purchase purchase) {
		super();
		this.productId = productId;
		this.meme = meme;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productType = productType;
		this.color = color;
		this.gender = gender;
		this.size = size;
		this.price = price;
		this.quantity = quantity;
		this.numberSold = numberSold;
		this.quantityInCart = quantityInCart;
		this.purchase = purchase;
	}

	public Product(Meme meme, String productName, String productDescription, String productType,
			String color, String gender, String size, double price, int quantity, int numberSold, int quantityInCart,
			Purchase purchase) {
		super();
		this.meme = meme;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productType = productType;
		this.color = color;
		this.gender = gender;
		this.size = size;
		this.price = price;
		this.quantity = quantity;
		this.numberSold = numberSold;
		this.quantityInCart = quantityInCart;
	}
	
	public Product(Meme meme, String productName, String productDescription, String productType,
			String color, String gender, String size, double price, int quantity, int quantityInCart,
			Purchase purchase) {
		super();
		this.meme = meme;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productType = productType;
		this.color = color;
		this.gender = gender;
		this.size = size;
		this.price = price;
		this.quantity = quantity;
		this.quantityInCart = quantityInCart;
		this.purchase = purchase;
	}
	
	public Product(Meme meme, String productName, String productDescription, String productType,
			double price, int quantity, int quantityInCart, Purchase purchase) {
		super();
		this.meme = meme;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productType = productType;
		this.price = price;
		this.quantity = quantity;
		this.quantityInCart = quantityInCart;
		this.purchase = purchase;
	}
	
	public Product(Meme meme, String productName, String productDescription, String productType,
			double price) {
		super();
		this.meme = meme;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productType = productType;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Meme getMeme() {
		return meme;
	}

	public void setMeme(Meme meme) {
		this.meme = meme;
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

	public int getNumberSold() {
		return numberSold;
	}

	public void setNumberSold(int numberSold) {
		this.numberSold = numberSold;
	}

	public int getQuantityInCart() {
		return quantityInCart;
	}

	public void setQuantityInCart(int quantityInCart) {
		this.quantityInCart = quantityInCart;
	}

	public Purchase getPurchase() {
		return purchase;
	}

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", meme=" + meme + ", productName=" + productName
				+ ", productDescription=" + productDescription + ", productType=" + productType + ", color=" + color
				+ ", gender=" + gender + ", size=" + size + ", price=" + price + ", quantity=" + quantity
				+ ", numberSold=" + numberSold + ", quantityInCart=" + quantityInCart + ", purchase=" + purchase + "]";
	}

}
