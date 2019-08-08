package com.revature.controllers;

import java.io.StringReader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

import com.revature.beans.*;
import com.revature.services.*;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(value="/address")
public class AddressController {

private AddressService addressService;
	
	@Autowired
	public void setAddressService(AddressService addressService) {
		this.addressService = addressService;
	}
	
	@RequestMapping(value="/addAddress", method=RequestMethod.POST)
	public ResponseEntity<String> addAddress(@RequestBody Address address) {
		ResponseEntity<String> resp = null;
		
		try {
			addressService.addAddress(address);
			resp = new ResponseEntity<>("ADDRESS CREATED SUCCESSFULLY", HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>("FAILED TO CREATE ADDRESS", HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
	
	@RequestMapping(value="/updateAddress", method=RequestMethod.POST)
	public ResponseEntity<String> updateAddress(@RequestBody Address address) {
		ResponseEntity<String> resp = null;
		
		try {
			addressService.updateAddress(address);
			resp = new ResponseEntity<>("ADDRESS UPDATED SUCCESSFULLY", HttpStatus.OK);
		} catch (Exception e) {
			resp = new ResponseEntity<>("FAILED TO UPDATE ADDRESS", HttpStatus.BAD_REQUEST);
		}
		return resp;
	}
	
	@RequestMapping(value="/getAddressById/{addressId}", method=RequestMethod.GET)
	public ResponseEntity<Address> getAddressById(@PathVariable int addressId) {
		Address a = addressService.getAddressById(addressId);
		if (a == null) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<>(a, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value="/getAddressesByUserId/{userId}", method=RequestMethod.GET)
	public ResponseEntity<List<Address>> getAddressesForUser(@PathVariable int userId) {
		List<Address> a = addressService.getAddressesForUser(userId);
		if (a == null) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<>(a, HttpStatus.OK);
		}
	}
}
