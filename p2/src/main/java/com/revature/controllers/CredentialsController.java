package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Credentials;
import com.revature.services.CredentialsService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(value="/credentials")
public class CredentialsController {
	
private CredentialsService credentialService;
	
	@Autowired // setter injection
	public void setUserService(CredentialsService credentialService) {
		this.credentialService = credentialService;
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/allcredentials", method=RequestMethod.GET)
	public ResponseEntity<List<Credentials>> getAllCredentials() {
		return new ResponseEntity<>(credentialService.getAllCredentials(), HttpStatus.OK);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping // we could also do RequestMapping with RequestMethod.POST
	public ResponseEntity<String> addCredential(@RequestBody Credentials credentials) {
		ResponseEntity<String> resp = null;
		try {
			credentialService.createCredentials(credentials);;
			resp = new ResponseEntity<>("CREDENTIAL CREATED SUCCESSFULLY", HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>("FAILED TO CREATE CREDENTIAL", HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
}
