package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.*;
import com.revature.daos.*;

@Service
public class PurchaseService {

	private PurchaseDAO purchaseDAO;
	
	@Autowired
	public PurchaseService(PurchaseDAO purchaseDAO) {
		this.purchaseDAO = purchaseDAO;
	}
	
	/*
	 * public void addPurchase(Parsing data) { System.out.println(data); User tuser
	 * = new User(data.getUserId(), data.getFirstName(), data.getLastName(),
	 * data.getEmail(), null); Purchase tpurchase = new Purchase(); //Payment
	 * tpayment = new Payment(data.getInteger(), data.getInteger(),
	 * data.getString(), data.getDate());
	 * 
	 * //this.purchaseDAO.addPurchase(tpurchase, tpayment); }
	 */
	
	public List<Purchase> getAllPurchases() {
		return this.purchaseDAO.getAllPurchases();
	}
	
	public Purchase getPurchaseById(int purchaseId) {
		return this.purchaseDAO.getPurchaseById(purchaseId);
	}
	
	public List<Purchase> getPurchasesForUser(int userId) {
		return this.purchaseDAO.getPurchasesForUser(userId);
	}
}
