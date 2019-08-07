package com.revature.daos;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.beans.*;

@Repository(value="productDAO")
@Transactional
public class ProductDAOImpl implements ProductDAO {

	private SessionFactory sessionFactory;
	
	@Autowired
	public ProductDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Product> getAllProducts() {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("from Product").getResultList();
	}

	@Override
	public void addProduct(Product product) {
		sessionFactory.getCurrentSession().merge(product);
	}

	@Override
	public List<Product> getProductColors() {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("select distinct color from Product").getResultList();
	}

	@Override
	public List<Product> getProductSizes() {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("select distinct size from Product").getResultList();
	}

	@Override
	public List<Product> getProductTypes() {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("select distinct productType from Product").getResultList();
	}
	
}
