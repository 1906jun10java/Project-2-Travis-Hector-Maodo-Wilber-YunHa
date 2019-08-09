package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Credentials;
import com.revature.beans.User;
import com.revature.beans.Parsing;
import com.revature.services.LoginService;;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(value="/login")
public class LoginController {
	
private LoginService loginService;
	
	@Autowired // setter injection
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> getAllUsers() {
		return new ResponseEntity<>(loginService.getAllUsers(), HttpStatus.OK);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@ResponseStatus(HttpStatus.OK)
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public User getCredentials(@RequestBody Credentials credentials) {

		return loginService.loginVerification(credentials);
	}
	
<<<<<<< HEAD
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping(value="/signUp", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> userSignUp(@RequestBody Parsing user) {
		ResponseEntity<String> resp = null;
		try {
			loginService.signUp(user);
			resp = new ResponseEntity<>("USER CREATED SUCCESSFULLY", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			resp = new ResponseEntity<>("FAILED TO CREATE USER", HttpStatus.BAD_REQUEST);
		}
		return resp;
=======
	@CrossOrigin(value="/signUp", origins="http://localhost:4200")
	@ResponseStatus(HttpStatus.OK)
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public boolean addUser(@RequestBody Parsing user) {
		return loginService.signUp(user);
>>>>>>> 26adc4b2893a505914b95e6a7cc17aea52d81274
	}
}

		System.out.println(credentials);
		return loginService.loginVerification(credentials);
	}
}

