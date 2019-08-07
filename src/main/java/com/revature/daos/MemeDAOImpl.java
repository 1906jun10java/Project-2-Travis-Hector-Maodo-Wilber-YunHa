package com.revature.daos;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.beans.*;

@Repository(value="memeDAO")
@Transactional
public class MemeDAOImpl implements MemeDAO {

	private SessionFactory sessionFactory;
	
	@Autowired
	public MemeDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void addMeme(Meme meme) {
		sessionFactory.getCurrentSession().merge(meme);
	}

	@Override
	public List<Meme> getAllMemes() {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("from Meme").getResultList();
	}

}
