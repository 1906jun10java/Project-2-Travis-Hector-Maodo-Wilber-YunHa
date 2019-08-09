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

@Repository(value="addressDAO")
@Transactional
public class AddressDAOImpl implements AddressDAO {

	private SessionFactory sessionFactory;
	
	@Autowired
	public AddressDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addAddress(Address address) {
		sessionFactory.getCurrentSession().merge(address);
		
	}

	@Override
	public Address getAddressById(int addressId) {
		
		return sessionFactory.getCurrentSession().get(Address.class, addressId);
	}

	@Override
	public void updateAddress(Address address) {
		
		Transaction tx = null;
		
		try (Session session = sessionFactory.openSession();) {
			tx = session.beginTransaction();
			
			String hql = "UPDATE Address set addressLine1 = :addressLine1, " + "zipCode = :zipCode " 
			+ "WHERE addressId = " + address.getAddressId();
            Query query = session.createQuery(hql);
            query.setParameter("addressLine1", address.getAddressLine1());
            query.setParameter("zipCode", address.getZipCode());
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
	public List<Address> getAddressesForUser(int userId) {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("from Address where USER_ID = " + userId).getResultList();
	}
	
	@Override
	public void addOrUpdateAddress(Address address) {
		sessionFactory.getCurrentSession().saveOrUpdate(address);
		
	}
	
}
