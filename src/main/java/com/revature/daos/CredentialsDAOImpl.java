package com.revature.daos;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.beans.Credentials;

@Repository(value = "credentialDAO")
@Transactional
public class CredentialsDAOImpl implements CredentialsDAO{
	
	private SessionFactory sessionFactory;

	@Autowired // constructor injection
	public CredentialsDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addCredentials(Credentials credentials) {
		sessionFactory.getCurrentSession().persist(credentials);
	}

	@Override
	public List<Credentials> getAllCredentials() {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("from Credentials").getResultList();
	}
}
