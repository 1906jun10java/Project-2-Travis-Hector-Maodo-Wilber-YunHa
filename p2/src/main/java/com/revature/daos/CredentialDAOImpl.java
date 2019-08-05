package com.revature.daos;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.beans.Credential;
import com.revature.beans.User;



@Repository(value="CredentialDAO")
@Transactional
public class CredentialDAOImpl implements CredentialDAO{

	private SessionFactory sessionFactory;

	@Autowired //constructor injection
	public CredentialDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void createCustomer(Credential credential) {
		sessionFactory.getCurrentSession().persist(credential);
	}

	@Override
	public List<User> allCredentials() {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("FROM CREDENTIALS").getResultList();
	}

}
