package com.revature.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Credentials;
import com.revature.beans.User;
import com.revature.daos.LoginDAO;

@Service
public class LoginService {

	private LoginDAO loginDAO;
	
	@Autowired
	public LoginService(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}
	
	public User loginVerification(Credentials credential) {
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
	
	public boolean signUp(User user) {
		System.out.println(user);
		User tempUser = new User();
		Credentials creds = new Credentials();
		tempUser.setEmail(user.getEmail());
		tempUser.setFirstName(user.getFirstName());
		tempUser.setLastName(user.getLastName());
		if(tempUser.getEmail().isEmpty()) {
			return false;
		}
		creds.setUser(user);
		creds.setEmail(creds.getEmail());
		creds.setPassword(creds.getPassword());
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
