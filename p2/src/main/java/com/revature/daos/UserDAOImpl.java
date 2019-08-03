package com.revature.daos;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.beans.User;

@Repository(value="UserDAO")
@Transactional
public class UserDAOImpl implements UserDAO{
	
	private SessionFactory sessionFactory;

	/*
	 * @Autowired //constructor injection public UserDAOImpl(SessionFactory
	 * sessionFactory) { this.sessionFactory = sessionFactory; }
	 */
	
	@Override
	public List<User> allUsers() {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("FROM USER").getResultList();
	}

	@Override
	public User getUserdById(int userId) {
		return sessionFactory.getCurrentSession().get(User.class, userId);
	}

	@Override
	public User getUserByUserName(String userName) {
		return sessionFactory.getCurrentSession().get(User.class, userName);
	}
	
	@Override
	public void createUser(User user) {
		sessionFactory.getCurrentSession().persist(user);	
	}

}
