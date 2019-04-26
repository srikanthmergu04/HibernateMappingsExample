package com.srikanth.Dao.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.srikanth.Dao.BankAccountDao;
import com.srikanth.Model.BankAccount;

public class BankAccountDaoImpl implements BankAccountDao {
	
	@Autowired
	SessionFactory sessionFactory;

	public void addaccount(BankAccount account) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.openSession();
		
		Transaction tr = session.beginTransaction();
		
		session.save(account);
		
		tr.commit();
		
		session.close();
			

	}

}
