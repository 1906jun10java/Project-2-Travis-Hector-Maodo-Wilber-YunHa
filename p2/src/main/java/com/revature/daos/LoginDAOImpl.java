package com.revature.daos;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.revature.beans.Credentials;
import com.revature.beans.User;

@Repository(value = "loginDAO")
@Transactional
public class LoginDAOImpl implements LoginDAO{
	
	private SessionFactory sessionFactory;

	@Autowired
	public LoginDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public List<User> getAllUsers() {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("from User").getResultList();
	}

	@Override
	public User getUserById(int userId) {
		return sessionFactory.getCurrentSession().get(User.class, userId);
	}

	@Override
	public User getUserByEmail(String email) {
		return sessionFactory.getCurrentSession().get(User.class, email);
	}

	@Override
	public List<Credentials> getAllCredentials() {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("from Credentials").getResultList();
	}

	@Override
	public Credentials getCredentials(int id) {
		return sessionFactory.getCurrentSession().get(Credentials.class, id);
	}

	@Override
	public void signUp(User user, Credentials creds) {
			Session s = sessionFactory.getCurrentSession();
			s.persist(user);
	}

}
