package com.revature.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.*;
import com.revature.daos.*;

@Service
public class ProductService {

	private ProductDAO productDAO;
	
	@Autowired
	public ProductService(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	public List<Product> getAllProducts() {
		return this.productDAO.getAllProducts();
	}
	
	public void createProduct(Product product) {
		this.productDAO.addProduct(product);
	}
	
	public List<Product> getProductColors() {
		return this.productDAO.getProductColors();
	}
	
	public List<Product> getProductSizes() {
		return this.productDAO.getProductSizes();
	}
	
	public List<Product> getProductTypes() {
		return this.productDAO.getProductTypes();
	}
	
	public Product getProductById(int productId) {
		return this.productDAO.getProductById(productId);
	}
	
	public List<Product> getRandomizedProducts() {
		List<Product> allProducts = productDAO.getRandomizedProducts();
		Collections.shuffle(allProducts);
		List<Product> someProducts = new ArrayList<>();
		
		for(int i = 0; i < 20; i++) {
			someProducts.add(allProducts.get(i));
		}
		
		return someProducts;
	}
	
	
}