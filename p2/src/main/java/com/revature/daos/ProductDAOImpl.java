package com.revature.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.revature.beans.Product;

public class ProductDAOImpl implements ProductDAO {

	private SessionFactory sessionFactory;

	@Autowired // constructor injection
	public ProductDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Product> allProducts() {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("FROM PRODUCT").getResultList();
	}

	@Override
	public Product getProductdById(int productId) {
		return sessionFactory.getCurrentSession().get(Product.class, productId);
	}

	@Override
	public Product getProductByName(String productName) {
		return sessionFactory.getCurrentSession().get(Product.class, productName);
	}

	@Override
	public Product getProductByType(String productType) {
		return sessionFactory.getCurrentSession().get(Product.class, productType);
	}

	@Override
	public Product getProductByGender(String gender) {
		return sessionFactory.getCurrentSession().get(Product.class, gender);
	}

	@Override
	public Product getProductByColor(String color) {
		return sessionFactory.getCurrentSession().get(Product.class, color);
	}

	@Override
	public Product getProductBySize(String size) {
		return sessionFactory.getCurrentSession().get(Product.class, size);
	}

	@Override
	public void createProduct(Product product) {
		sessionFactory.getCurrentSession().persist(product);

	}

}
