package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Product;

public class ProductService {

	private List<Product> products = new ArrayList<>();

	public List<Product> allProducts() {
		return this.products;
	}

	public void createProduct(Product product) {
		products.add(product);
	}

	public Product getProductdById(int productId) {
		Product product = null;
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getProductId() == productId) {
				product = products.get(i);
			}
		}
		return product;
	}

	public Product getProductByName(String productName) {
		Product product = null;
		List<Product> products = new ArrayList<>(allProducts());
		for (Product pList : products)
			if (pList.getProductName() == null) {
				return null;
			} else if (pList.getProductName().equals(productName)) {
				return product;
			}
		return null;
	}

	public Product getProductByType(String productType) {
		Product product = null;
		List<Product> products = new ArrayList<>(allProducts());
		for (Product pList : products)
			if (pList.getProductType() == null) {
				return null;
			} else if (pList.getProductType().equals(productType)) {
				return product;
			}
		return null;
	}

	public Product getProductByGender(String gender) {
		Product product = null;
		List<Product> products = new ArrayList<>(allProducts());
		for (Product pList : products)
			if (pList.getGender() == null) {
				return null;
			} else if (pList.getGender().equals(gender)) {
				return product;
			}
		return null;
	}

	public Product getProductByColor(String color) {
		Product product = null;
		List<Product> products = new ArrayList<>(allProducts());
		for (Product pList : products)
			if (pList.getColor() == null) {
				return null;
			} else if (pList.getColor().equals(color)) {
				return product;
			}
		return null;
	}

	public Product getProductBySize(String size) {
		Product product = null;
		List<Product> products = new ArrayList<>(allProducts());
		for (Product pList : products)
			if (pList.getSize() == null) {
				return null;
			} else if (pList.getSize().equals(size)) {
				return product;
			}
		return null;
	}

}
