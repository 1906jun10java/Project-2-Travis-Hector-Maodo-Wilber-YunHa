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

@Repository(value="purchaseItemDAO")
@Transactional
public class PurchaseItemDAOImpl implements PurchaseItemDAO {

	private SessionFactory sessionFactory;
	
	@Autowired
	public PurchaseItemDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addPurchaseItem(PurchaseItem purchaseItem) {
		sessionFactory.getCurrentSession().merge(purchaseItem);
		
	}

	@Override
	public void updatePurchaseItem(PurchaseItem purchaseItem) {
		
		Transaction tx = null;
		
		try (Session session = sessionFactory.openSession();) {
			tx = session.beginTransaction();
			
			String hql = "UPDATE PurchaseItem set quantityPurchased = :quantityPurchased, " + 
			"total = :total " + "WHERE purchaseItemId = " + purchaseItem.getPurchaseItemId();
            Query query = session.createQuery(hql);
            query.setParameter("quantityPurchased", purchaseItem.getQuantityPurchased());
            query.setParameter("total", purchaseItem.getTotal());
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
	public void deletePurchaseItem(PurchaseItem purchaseItem) {
		sessionFactory.getCurrentSession().delete(purchaseItem);
		
	}

	@Override
	public PurchaseItem getPurchaseItemById(int purchaseItemId) {
		return sessionFactory.getCurrentSession().get(PurchaseItem.class, purchaseItemId);
	}

	@Override
	public List<PurchaseItem> getPurchaseItemsForPurchase(int purchaseId) {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("from PurchaseItem where PURCHASE_ID = " + purchaseId).getResultList();
	}
	
	
}
