package com.srikanth.Dao.Impl;

import com.srikanth.Dao.BankAccountDao;
import com.srikanth.Model.BankAccount;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

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

    public List<BankAccount> listAllAccounts() {
        // TODO Auto-generated method stub
        Session session = sessionFactory.openSession();

        Query query = (Query) session.createQuery("from BankAccount");

        List<BankAccount> list = new ArrayList();

        list = query.list();

        session.close();

        return list;
    }

}
