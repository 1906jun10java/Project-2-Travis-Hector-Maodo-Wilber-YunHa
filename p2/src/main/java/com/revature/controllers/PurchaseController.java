package com.revature.controllers;

import java.io.StringReader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.*;
import com.revature.services.*;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(value="/purchase")
public class PurchaseController {

	private PurchaseService purchaseService;
	
	@Autowired
	public void setPurchaseService(PurchaseService purchaseService) {
		this.purchaseService = purchaseService;
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public ResponseEntity<List<Purchase>> getAllMemes() {
		return new ResponseEntity<>(purchaseService.getAllPurchases(), HttpStatus.OK);
	}
	
	/*
	 * @CrossOrigin(origins="http://localhost:4200")
	 * 
	 * @RequestMapping(value="/addPurchase", method=RequestMethod.POST) public
	 * ResponseEntity<String> addPurchase(@RequestBody Parsing purchase) {
	 * ResponseEntity<String> resp = null;
	 * 
	 * try { purchaseService.addPurchase(purchase); resp = new
	 * ResponseEntity<>("PURCHASE CREATED SUCCESSFULLY", HttpStatus.OK); } catch
	 * (Exception e) { resp = new ResponseEntity<>("FAILED TO CREATE PURCHASE",
	 * HttpStatus.BAD_REQUEST); } return resp; }
	 */
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/getPurchaseById/{purchaseId}", method=RequestMethod.GET)
	public ResponseEntity<Purchase> getPurchaseById(@PathVariable int purchaseId) {
		Purchase p = purchaseService.getPurchaseById(purchaseId);
		if (p == null) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<>(p, HttpStatus.OK);
		}
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/getPurchasesByUserId/{userId}", method=RequestMethod.GET)
	public ResponseEntity<List<Purchase>> getPurchasesForUser(@PathVariable int userId) {
		List<Purchase> p = purchaseService.getPurchasesForUser(userId);
		if (p == null) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<>(p, HttpStatus.OK);
		}
	}
}
