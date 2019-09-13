package com.srikanth.Service;

import com.srikanth.Model.BankAccount;

import java.util.List;

public interface BankAccountService {

    public void addaccount(BankAccount account);

    public List<BankAccount> listAllAccounts();

}
