package com.srikanth.Service;

import java.util.List;

import com.srikanth.Model.BankAccount;

public interface BankAccountService {
	
	public void addaccount(BankAccount account);
	
	public List<BankAccount> listAllAccounts();

}
