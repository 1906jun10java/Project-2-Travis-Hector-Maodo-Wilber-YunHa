package com.revature.daos;

import java.util.List;

import com.revature.beans.*;

public interface ProductDAO {
	public List<Product> getAllProducts();
	public void addProduct(Product product);
}
