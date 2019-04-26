package com.srikanth.Service;

import java.util.List;

import com.srikanth.Model.Address;

public interface AddressService {
	
	public void addAddress(Address address);
	
	public List<Address> listAllAddress();

}
