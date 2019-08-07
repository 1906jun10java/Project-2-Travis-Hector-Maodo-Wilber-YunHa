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

}
