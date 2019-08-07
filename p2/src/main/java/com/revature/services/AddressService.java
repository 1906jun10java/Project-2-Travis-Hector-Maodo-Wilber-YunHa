package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.*;
import com.revature.daos.*;

@Service
public class AddressService {

	private AddressDAO addressDAO;
	
	@Autowired
	public AddressService(AddressDAO addressDAO) {
		this.addressDAO = addressDAO;
	}

}
