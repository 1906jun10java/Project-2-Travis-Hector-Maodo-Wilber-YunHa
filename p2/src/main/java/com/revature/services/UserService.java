package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.User;
import com.revature.daos.UserDAO;

@Service
public class UserService {

	private UserDAO userDAO;
	
	@Autowired
	public UserService(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public List<User> getAllUsers() {
		return this.userDAO.getAllUsers();
	}
	
	public void createUser(User user) {
		this.userDAO.addUser(user);
	}
	
}
