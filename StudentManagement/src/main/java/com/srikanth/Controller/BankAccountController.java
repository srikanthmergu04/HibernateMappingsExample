package com.srikanth.Controller;

import com.srikanth.Model.BankAccount;
import com.srikanth.Service.Impl.BankAccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("BankService")
public class BankAccountController {

    @Autowired
    BankAccountServiceImpl bankAccountService;

    @RequestMapping(value = "/registerBankAccount", method = RequestMethod.POST)
    public BankAccount registerBankAccount(@RequestBody BankAccount account)//@RequestParam("acNo") int acNo , @RequestParam("IFSC") String IFSC , @RequestParam("branch") String branch
    {
        /*
         * BankAccount account = new BankAccount();
         *
         * account.setAcNo(acNo); account.setIFSC(IFSC); account.setBranch(branch);
         */

        bankAccountService.addaccount(account);

        return account;

    }

    @RequestMapping(value = "/listAllAccounts", method = RequestMethod.GET)
    public List<BankAccount> listAllAccounts() {
        return bankAccountService.listAllAccounts();

    }

}
