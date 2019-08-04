package com.revature.daos;

import java.util.List;

import com.revature.beans.Credential;
import com.revature.beans.User;

public interface CredentialDAO {
	public void createCustomer(Credential credential);
	public List<User> allCredentials();
}
