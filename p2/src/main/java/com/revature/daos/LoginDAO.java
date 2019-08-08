package com.revature.daos;

import java.util.List;

import com.revature.beans.Credentials;
import com.revature.beans.User;

public interface LoginDAO {
	public List<User> getAllUsers();
	public User getUserById(int id);
	public User getUserByEmail(String email);
	public List<Credentials> getAllCredentials();
	public Credentials getCredentials(int id);
	public void userSignUp(User user, Credentials cred);
	
}