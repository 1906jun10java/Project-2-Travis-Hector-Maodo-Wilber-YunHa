package com.revature.daos;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
	
	
	
}
