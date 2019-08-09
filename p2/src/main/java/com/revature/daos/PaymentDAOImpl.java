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

@Repository(value="paymentDAO")
@Transactional
public class PaymentDAOImpl implements PaymentDAO {

	private SessionFactory sessionFactory;
	
	@Autowired
	public PaymentDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addPayment(Payment payment) {
		sessionFactory.getCurrentSession().merge(payment);
		
	}

	@Override
	public void updatePayment(Payment payment) {
		
		Transaction tx = null;
		
		try (Session session = sessionFactory.openSession();) {
			tx = session.beginTransaction();
			
			String hql = "UPDATE Payment set cardNumber = :cardNumber, nameOnCard = :nameOnCard, expirationDate = :expirationDate, "
			 + "securityCode = :securityCode, cardType = :cardType WHERE paymentId = " + payment.getPaymentId();
            Query query = session.createQuery(hql);
            query.setParameter("cardNumber", payment.getCardNumber());
            query.setParameter("nameOnCard", payment.getNameOnCard());
            query.setParameter("expirationDate", payment.getExpirationDate());
            query.setParameter("securityCode", payment.getSecurityCode());
            query.setParameter("cardType", payment.getCardType());
            int result = query.executeUpdate();
            System.out.println("Rows affected: " + result);
			
			tx.commit();
		} catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
		
	}

	@Override
	public void deletePayment(Payment payment) {
		sessionFactory.getCurrentSession().delete(payment);
		
	}

	@Override
	public Payment getPaymentById(int paymentId) {
		return sessionFactory.getCurrentSession().get(Payment.class, paymentId);
	}

	@Override
	public List<Payment> getPaymentsForUser(int userId) {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("from Payment where USER_ID = " + userId).getResultList();
	}
	
}
