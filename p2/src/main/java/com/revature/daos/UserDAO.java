package com.revature.daos;

import java.util.List;

import com.revature.beans.User;

public interface UserDAO {
	public List<User> allUsers();
	public User getUserdById(int userserId);
	public User getUserByUserName(String userName);
	public User getUserByUserType(String userType);
	public void createUser(User user);
}
