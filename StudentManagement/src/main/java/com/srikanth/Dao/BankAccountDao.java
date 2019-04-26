package com.srikanth.Dao;

import java.util.List;

import com.srikanth.Model.BankAccount;

public interface BankAccountDao {
	
	public void addaccount(BankAccount account);

	public List<BankAccount> listAllAccounts();
}
