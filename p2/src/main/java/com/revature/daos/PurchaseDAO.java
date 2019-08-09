package com.revature.daos;

import java.util.List;

import com.revature.beans.*;

public interface PurchaseDAO {

	public void addPurchase(Purchase purchase, Payment payment);
	
	public List<Purchase> getAllPurchases();
	
	public Purchase getPurchaseById(int purchaseId);
	
	public List<Purchase> getPurchasesForUser(int userId);
}
