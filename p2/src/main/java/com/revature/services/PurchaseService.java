package com.revature.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.*;
import com.revature.daos.*;

@Service
public class PurchaseService {

	private PurchaseDAO purchaseDAO;
	private ProductDAO productDAO;
	
	@Autowired
	public PurchaseService(PurchaseDAO purchaseDAO) {
		this.purchaseDAO = purchaseDAO;
	}
	
	public void addPurchase(Purchase purchase) {
		this.purchaseDAO.addPurchase(purchase);
	}
	
	public List<Purchase> getAllPurchases() {
		return this.purchaseDAO.getAllPurchases();
	}
	
	public Purchase getPurchaseById(int purchaseId) {
		return this.purchaseDAO.getPurchaseById(purchaseId);
	}
	
	public List<Purchase> getPurchasesForUser(int userId) {
		return this.purchaseDAO.getPurchasesForUser(userId);
	}
	
	public void completePurchase(List<Object> cartItems) {
		System.out.println((User)cartItems.get(0));
		System.out.println(cartItems.get(1));
		System.out.println(cartItems.get(2));
		System.out.println(cartItems.get(3));
		System.out.println(cartItems.get(4));
		System.out.println(cartItems.get(5));
		
		User user = (User) cartItems.get(0);
		System.out.println(user);
		Double total = (Double) cartItems.get(1);
		System.out.println(total);
		Payment payment = (Payment) cartItems.get(2);
		System.out.println(payment);
		Address address = (Address) cartItems.get(3);
		System.out.println(address);
		Date date = (Date) cartItems.get(4);
		System.out.println(date);
		
		Purchase purchase = new Purchase(user, total, payment, address, date);
		//System.out.println(purchase);
		purchaseDAO.addPurchase(purchase);
		
		List<Product> purchaseItems = (List<Product>) cartItems.get(5);
		
		for (Product product : purchaseItems) {
			productDAO.addProduct(product);
			//System.out.println(product);
		}
	}
}
