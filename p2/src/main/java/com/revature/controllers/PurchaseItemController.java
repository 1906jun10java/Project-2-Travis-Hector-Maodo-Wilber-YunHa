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

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

import com.revature.beans.*;
import com.revature.services.*;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(value="/purchaseitem")
public class PurchaseItemController {

	private PurchaseItemService purchaseItemService;
	
	@Autowired
	public void setPurchaseItemService(PurchaseItemService purchaseItemService) {
		this.purchaseItemService = purchaseItemService;
	}
	
	@RequestMapping(value="/addPurchaseItem", method=RequestMethod.POST)
	public ResponseEntity<String> addPurchaseItem(@RequestBody PurchaseItem purchaseItem) {
		ResponseEntity<String> resp = null;
		
		try {
			purchaseItemService.addPurchaseItem(purchaseItem);
			resp = new ResponseEntity<>("PURCHASE ITEM CREATED SUCCESSFULLY", HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>("FAILED TO CREATE PURCHASE ITEM", HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
	
	@RequestMapping(value="/updatePurchaseItem", method=RequestMethod.POST)
	public ResponseEntity<String> updatePurchaseItem(@RequestBody PurchaseItem purchaseItem) {
		ResponseEntity<String> resp = null;
		
		try {
			purchaseItemService.updatePurchaseItem(purchaseItem);
			resp = new ResponseEntity<>("PURCHASE ITEM UPDATED SUCCESSFULLY", HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>("FAILED TO UPDATE PURCHASE ITEM", HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
	
	@RequestMapping(value="/deletePurchaseItem", method=RequestMethod.POST)
	public ResponseEntity<String> deletePurchaseItem(@RequestBody PurchaseItem purchaseItem) {
		ResponseEntity<String> resp = null;
		
		try {
			purchaseItemService.deletePurchaseItem(purchaseItem);
			resp = new ResponseEntity<>("PURCHASE ITEM DELETE SUCCESSFULLY", HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>("FAILED TO CREATE DELETE ITEM", HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
	
	@RequestMapping(value="/getPurchaseItemById/{purchaseItemId}", method=RequestMethod.GET)
	public ResponseEntity<PurchaseItem> getPurchaseItemById(@PathVariable int purchaseItemId) {
		PurchaseItem p = purchaseItemService.getPurchaseItemById(purchaseItemId);
		if (p == null) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<>(p, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/getPurchaseItemByPurchaseId/{purchaseId}", method=RequestMethod.GET)
	public ResponseEntity<List<PurchaseItem>> getPurchaseItemsForPurchase(@PathVariable int purchaseId) {
		List<PurchaseItem> p = purchaseItemService.getPurchaseItemsForPurchase(purchaseId);
		if (p == null) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<>(p, HttpStatus.OK);
		}
	}
	
}
