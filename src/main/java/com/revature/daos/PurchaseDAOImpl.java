package com.revature.daos;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
	
}
