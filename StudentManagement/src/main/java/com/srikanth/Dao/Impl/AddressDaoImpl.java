package com.srikanth.Dao.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.srikanth.Dao.AddressDao;
import com.srikanth.Model.Address;

public class AddressDaoImpl implements AddressDao {
	
	@Autowired
	SessionFactory sessionFactory;

	public void addAddress(Address address) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.openSession();
		
		Transaction tr = session.beginTransaction();
		
		session.save(address);
		
		tr.commit();
		
		session.close();	
		

	}

}
