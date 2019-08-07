package com.revature.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Credentials;
import com.revature.daos.CredentialsDAO;

@Service
public class CredentialsService {

	private CredentialsDAO credentialsDAO;
	
	@Autowired
	public CredentialsService(CredentialsDAO credentialsDAO) {
		this.credentialsDAO = credentialsDAO;
	}
	
	public List<Credentials> getAllCredentials() {
		return this.credentialsDAO.getAllCredentials();
	}
	
	public void createCredentials(Credentials credentials) {
		this.credentialsDAO.addCredentials(credentials);
	}
}
