package com.revature.daos;

import java.util.List;

import com.revature.beans.User;

public interface UserDAO {
	public List<User> getAllUsers();
	public void addUser(User user);
}
