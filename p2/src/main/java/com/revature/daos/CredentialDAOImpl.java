package com.revature.daos;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.beans.Credential;

@Repository(value="CredentialDAO")
@Transactional
public class CredentialDAOImpl implements CredentialDAO{

	private SessionFactory sessionFactory;

	/*@Autowired //constructor injection
	public CredentialDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}*/
	
	@Override
	public void createUser(Credential credential) {
		sessionFactory.getCurrentSession().persist(credential);
	}

}
