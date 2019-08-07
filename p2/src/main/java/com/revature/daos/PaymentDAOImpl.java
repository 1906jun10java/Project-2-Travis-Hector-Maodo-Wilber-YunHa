package com.revature.daos;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.beans.*;

@Repository(value="paymentDAO")
@Transactional
public class PaymentDAOImpl implements PaymentDAO {

	private SessionFactory sessionFactory;
	
	@Autowired
	public PaymentDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Payment> getAllPayments() {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("from Payment").getResultList();
	}

	@Override
	public void addPayment(Payment payment) {
		sessionFactory.getCurrentSession().merge(payment);
	}
	
}
