package com.revature.daos;

import java.util.List;

import com.revature.beans.*;

public interface AddressDAO {

	public void addAddress(Address address);
	
	public Address getAddressById(int id);
	
	public List<Address> getAddressesForUser(int userId);
	
	public void updateAddress(Address address);
	
}
