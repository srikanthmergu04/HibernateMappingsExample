package com.srikanth.Dao.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.srikanth.Dao.LaptopDao;
import com.srikanth.Model.Laptop;

public class LaptopDaoImpl implements LaptopDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public int addLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		
	Session session = sessionFactory.openSession();
		
		Transaction trnx = session.beginTransaction();
		
		int primary = (Integer) session.save(laptop);
		
		System.out.println("primary = "+primary);
		
		trnx.commit();
		
		session.close();
		
		return primary;
		
	}

}
