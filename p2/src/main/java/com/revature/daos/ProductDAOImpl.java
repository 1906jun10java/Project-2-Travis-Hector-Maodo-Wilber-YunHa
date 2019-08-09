package com.revature.daos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
//import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.criterion.Restrictions;
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

	@Override
	public Product getProductById(int productId) {
		return sessionFactory.getCurrentSession().get(Product.class, productId);
	}

	@Override
	public List<Product> getRandomizedProducts() {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("from Product").getResultList();
	}
	
	@Override
	public List<Product> getProductsByColor(String color) {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("from Product where color = '" + color +"'").getResultList();
	}
	
	@Override
	public List<Product> getProductsByGender(String gender) {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("from Product where gender = '" + gender+ "'").getResultList();
	}
	
	@Override
	public List<Product> getProductsByType(String type) {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("from Product where productType = '" + type + "'").getResultList();
	}
	
	@Override
	public List<Product> getProductsBySize(String size) {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("from Product where size = '" + size + "'").getResultList();
	}


	
}