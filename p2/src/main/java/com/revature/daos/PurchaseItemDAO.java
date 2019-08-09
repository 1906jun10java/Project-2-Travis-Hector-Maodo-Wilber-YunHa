package com.revature.daos;

import java.util.List;

import com.revature.beans.*;

public interface PurchaseItemDAO {

	public void addPurchaseItem(PurchaseItem purchaseItem);
	
	public void updatePurchaseItem(PurchaseItem purchaseItem);
	
	public void deletePurchaseItem(PurchaseItem purchaseItem);
	
	public PurchaseItem getPurchaseItemById(int purchaseItemId);
	
	public List<PurchaseItem> getPurchaseItemsForPurchase(int purchaseId);
	
}
