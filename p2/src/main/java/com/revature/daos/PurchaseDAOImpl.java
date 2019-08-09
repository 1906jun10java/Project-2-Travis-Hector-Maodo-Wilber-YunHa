package com.revature.daos;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.beans.*;

@Repository(value="purchaseDAO")
@Transactional
public class PurchaseDAOImpl implements PurchaseDAO {

	private SessionFactory sessionFactory;
	
	@Autowired
	public PurchaseDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addPurchase(Purchase purchase) {
		sessionFactory.getCurrentSession().merge(purchase);
		
	}

	@Override
	public List<Purchase> getAllPurchases() {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("from Purchase").getResultList();
	}

	@Override
	public Purchase getPurchaseById(int purchaseId) {
		return sessionFactory.getCurrentSession().get(Purchase.class, purchaseId);
	}

	@Override
	public List<Purchase> getPurchasesForUser(int userId) {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("from Purchase where USER_ID = " + userId).getResultList();
	}
	
}
