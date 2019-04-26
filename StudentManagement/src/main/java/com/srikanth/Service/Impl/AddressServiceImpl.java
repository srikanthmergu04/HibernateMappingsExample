package com.srikanth.Service.Impl;

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

}
