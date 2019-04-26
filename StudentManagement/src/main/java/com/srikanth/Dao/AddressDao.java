package com.srikanth.Dao;

import java.util.List;

import com.srikanth.Model.Address;

public interface AddressDao {
	
	public void addAddress(Address address);
	
	public List<Address> listAllAddress();

}
