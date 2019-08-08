package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.*;
import com.revature.daos.*;

@Service
public class PurchaseItemService {

	private PurchaseItemDAO purchaseItemDAO;
	
	@Autowired
	public PurchaseItemService(PurchaseItemDAO purchaseItemDAO) {
		this.purchaseItemDAO = purchaseItemDAO;
	}
	
	public void addPurchaseItem(PurchaseItem purchaseItem) {
		this.purchaseItemDAO.addPurchaseItem(purchaseItem);
	}
	
	public void updatePurchaseItem(PurchaseItem purchaseItem) {
		this.purchaseItemDAO.updatePurchaseItem(purchaseItem);
	}
	
	public void deletePurchaseItem(PurchaseItem purchaseItem) {
		this.purchaseItemDAO.deletePurchaseItem(purchaseItem);
	}
	
	public PurchaseItem getPurchaseItemById(int purchaseItemId) {
		return this.purchaseItemDAO.getPurchaseItemById(purchaseItemId);
	}
	
	public List<PurchaseItem> getPurchaseItemsForPurchase(int purchaseId) {
		return this.purchaseItemDAO.getPurchaseItemsForPurchase(purchaseId);
	}
	
	

}
