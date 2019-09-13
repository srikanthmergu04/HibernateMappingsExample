package com.srikanth.Dao;

import com.srikanth.Model.BankAccount;

import java.util.List;

public interface BankAccountDao {

    public void addaccount(BankAccount account);

    public List<BankAccount> listAllAccounts();
}
