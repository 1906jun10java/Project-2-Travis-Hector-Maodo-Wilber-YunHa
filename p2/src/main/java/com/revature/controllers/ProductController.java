package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Product;
import com.revature.services.ProductService;

@RestController
@RequestMapping(value="/product")
public class ProductController {
	
private ProductService productService;
	
	@Autowired // setter injection
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public ResponseEntity<List<Product>> getAllProdcuts() {
		return new ResponseEntity<>(productService.allProducts(), HttpStatus.OK);
	}
	
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
	
	@RequestMapping(value="/id/{id}", method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<Product> getProductById(@PathVariable int id)
	{	
		return new ResponseEntity<>(productService.getProductdById(id), HttpStatus.OK);
	}
	
	@RequestMapping(value="/byId", method=RequestMethod.GET)
	public ResponseEntity<Product> getFlashcardByIdQuery(@RequestParam("id") int id)
	{
		return new ResponseEntity<>(productService.getProductdById(id), HttpStatus.OK);
	}
	
}
