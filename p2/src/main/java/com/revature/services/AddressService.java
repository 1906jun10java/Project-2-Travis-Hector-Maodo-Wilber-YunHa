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
	
	public void addAddress(Address address) {
		this.addressDAO.addAddress(address);
	}
	
	public Address getAddressById(int addressId) {
		return this.addressDAO.getAddressById(addressId);
	}
	
	public List<Address> getAddressesForUser(int userId) {
		return this.addressDAO.getAddressesForUser(userId);
	}
	
	public void updateAddress(Address address) {
		this.addressDAO.updateAddress(address);
	}

}
