package com.revature.daos;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.beans.*;

@Repository(value="purchaseItemDAO")
@Transactional
public class PurchaseItemDAOImpl implements PurchaseItemDAO {

	private SessionFactory sessionFactory;
	
	@Autowired
	public PurchaseItemDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}
