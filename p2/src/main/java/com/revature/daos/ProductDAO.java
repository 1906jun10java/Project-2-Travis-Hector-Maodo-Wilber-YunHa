package com.revature.daos;

import java.util.List;

import com.revature.beans.Product;

public interface ProductDAO {
	public List<Product> allProducts();
	public Product getProductdById(int productId);
	public Product getProductByName(String productName);
	public Product getProductByType(String productType);
	public Product getProductByGender(String gender);
	public Product getProductByColor(String color);
	public Product getProductBySize(String size);
	public void createProduct(Product product);
}
