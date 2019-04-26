package com.srikanth.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.srikanth.Dao.Impl.AddressDaoImpl;
import com.srikanth.Model.Address;
import com.srikanth.Service.AddressService;

public class AddressServiceImpl implements AddressService {
	
	@Autowired
	AddressDaoImpl addressDao;

	public void addAddress(Address address) {
		// TODO Auto-generated method stub
		
		addressDao.addAddress(address);

	}

	public List<Address> listAllAddress() {
		// TODO Auto-generated method stub
		
		return addressDao.listAllAddress();
		
		//return null;
	}

}
