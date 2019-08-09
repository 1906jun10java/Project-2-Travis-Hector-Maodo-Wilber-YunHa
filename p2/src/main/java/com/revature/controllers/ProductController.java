package com.revature.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Address;
import com.revature.beans.Product;
import com.revature.services.ProductService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(value="/product")
public class ProductController {

	private ProductService productService;
	
	@Autowired
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/allproducts", method=RequestMethod.GET)
	public ResponseEntity<List<Product>> getAllProducts() {
		return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/colors", method=RequestMethod.GET)
	public ResponseEntity<List<Product>> getProductColors() {
		return new ResponseEntity<>(productService.getProductColors(), HttpStatus.OK);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/sizes", method=RequestMethod.GET)
	public ResponseEntity<List<Product>> getProductSizes() {
		return new ResponseEntity<>(productService.getProductSizes(), HttpStatus.OK);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/Types", method=RequestMethod.GET)
	public ResponseEntity<List<Product>> getProductTypes() {
		return new ResponseEntity<>(productService.getProductTypes(), HttpStatus.OK);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping // we could also do RequestMapping with RequestMethod.POST
	public ResponseEntity<String> addProduct(@RequestBody Product product) {
		ResponseEntity<String> resp = null;
		try {
			productService.createProduct(product);
			resp = new ResponseEntity<>("PRODUCT CREATED SUCCESSFULLY", HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>("FAILED TO CREATE PRODUCT", HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/byId/{productId}", method=RequestMethod.GET)
	public ResponseEntity<Product> getProductById(@PathVariable int productId) {
		Product p = productService.getProductById(productId);
		if (p == null) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<>(p, HttpStatus.OK);
		}
	}
	
}