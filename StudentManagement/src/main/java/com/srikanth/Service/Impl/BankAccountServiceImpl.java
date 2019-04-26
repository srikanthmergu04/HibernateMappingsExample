package com.srikanth.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.srikanth.Dao.Impl.BankAccountDaoImpl;
import com.srikanth.Model.BankAccount;
import com.srikanth.Service.BankAccountService;

public class BankAccountServiceImpl implements BankAccountService {
	
	@Autowired
	BankAccountDaoImpl bankAccountDao;

	public void addaccount(BankAccount account) {
		// TODO Auto-generated method stub
		
		bankAccountDao.addaccount(account);

	}

}
