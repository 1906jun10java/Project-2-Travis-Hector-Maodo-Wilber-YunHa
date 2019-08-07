package com.revature.services;

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

}
