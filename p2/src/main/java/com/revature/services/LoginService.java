package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Credentials;
import com.revature.beans.User;
import com.revature.beans.Parsing;
import com.revature.daos.LoginDAO;

@Service
public class LoginService {

	private LoginDAO loginDAO;
	
	@Autowired
	public LoginService(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}
	
	public User loginVerification(Credentials credential) {

	System.out.println(credential);

		List<User> uList = new ArrayList<>(); 
		uList = loginDAO.getAllUsers();
		for(User user : uList ) {
			if(credential.getEmail().equals(user.getEmail())) {
				Credentials creds = loginDAO.getCredentials(user.getUserId());
				//System.out.println(creds);
				if(creds.getPassword().equals(credential.getPassword())) {
					System.out.println(user);
					return user;
				}
			}
		}
		return null;
	}
	
<<<<<<< HEAD
	public boolean signUp(Parsing user) {
=======

	public boolean signUp(User user) {
>>>>>>> 26adc4b2893a505914b95e6a7cc17aea52d81274
		System.out.println(user);
		User tempUser = new User();
		Credentials creds = new Credentials();
		tempUser.setUserId(user.getUserId());;
		tempUser.setEmail(user.getEmail());
		tempUser.setFirstName(user.getFirstName());
		tempUser.setLastName(user.getLastName());
		System.out.println(tempUser);
		if(tempUser.getEmail().isEmpty()) {
			return false;
		}
		creds.setEmail(user.getEmail());
		creds.setPassword(user.getPassword());
		System.out.println(creds);
		if(creds.getPassword().isEmpty()) {
			return false;
		}
		if(loginDAO.getUserByEmail(tempUser.getEmail()) != null) {
			System.out.println(loginDAO.getUserByEmail(tempUser.getEmail()));
			return false;
		}
		loginDAO.signUp(tempUser, creds);
		return true;
	}
	
	public List<User> getAllUsers() {
		return this.loginDAO.getAllUsers();
	}
}

	public List<User> getAllUsers() {
		return this.loginDAO.getAllUsers();
	}
}

