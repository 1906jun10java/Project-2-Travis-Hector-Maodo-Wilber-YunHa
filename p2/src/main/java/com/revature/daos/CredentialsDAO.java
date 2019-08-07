package com.revature.daos;

import java.util.List;

import com.revature.beans.Credentials;

public interface CredentialsDAO {
	public void addCredentials(Credentials credentials);
	List<Credentials> getAllCredentials();
}
