package com.revature.daos;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.beans.User;

@Repository(value = "userDAO")
@Transactional
public class UserDAOImpl implements UserDAO{

	private SessionFactory sessionFactory;

	@Autowired // constructor injection
	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<User> getAllUsers() {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("from User").getResultList();
	}

	@Override
	public void addUser(User user) {
		sessionFactory.getCurrentSession().merge(user);
	}

}
