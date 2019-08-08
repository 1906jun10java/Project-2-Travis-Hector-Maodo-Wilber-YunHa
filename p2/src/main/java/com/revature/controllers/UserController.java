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

import com.revature.beans.User;
import com.revature.services.UserService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(value="/user")
public class UserController {
	
	private UserService userService;
	
	@Autowired // setter injection
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/allusers", method=RequestMethod.GET)
	public ResponseEntity<List<User>> getAllUsers() {
		return new ResponseEntity<>(userService.getAllUsers(), HttpStatus.OK);
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping // we could also do RequestMapping with RequestMethod.POST
	public ResponseEntity<String> addUser(@RequestBody User user) {
		ResponseEntity<String> resp = null;
		try {
			userService.createUser(user);
			resp = new ResponseEntity<>("USER CREATED SUCCESSFULLY", HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>("FAILED TO CREATE USER", HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
}
