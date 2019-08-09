package com.revature.daos;

import java.util.List;

import com.revature.beans.*;

public interface ProductDAO {
	public List<Product> getAllProducts();
	public void addProduct(Product product);
	public List<Product> getProductColors();
	public List<Product> getProductSizes();
	public List<Product> getProductTypes();
	public Product getProductById(int productId);
	public List<Product> getRandomizedProducts();
	public List<Product> getProductsByColor(String color);
	public List<Product> getProductsByGender(String gender);
	public List<Product> getProductsByType(String type);
	public List<Product> getProductsBySize(String size);
	
}