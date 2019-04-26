package com.srikanth.Dao.Impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.srikanth.Dao.AddressDao;
import com.srikanth.Model.Address;
import com.srikanth.Model.Laptop;

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

	public List<Address> listAllAddress() {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.openSession();
		
		Query query = (Query) session.createQuery("from Address");
		
		List<Address> list = new ArrayList();
		
		list = query.list();
		
		session.close();
		
		return list;
	
	}

}
