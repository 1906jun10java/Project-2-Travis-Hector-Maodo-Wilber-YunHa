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
	public Product getProductCritiria(String color, String size, String type, String gender);
}