package com.srikanth.Dao.Impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;


import com.srikanth.Dao.StudentDao;
import com.srikanth.Model.Student;
import com.srikanth.Model.Address;
import com.srikanth.Model.BankAccount;
import com.srikanth.Model.Laptop;

public class StudentDaoImpl implements StudentDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public int addStudent(Student student) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.openSession();
		
		Transaction trnx = session.beginTransaction();

		int primary = (Integer) session.save(student);
		
		System.out.println("primary = "+primary);
		
		trnx.commit();
		
		session.close();
		
		return primary;
		
		
	}

	public void addLaptop(int lid , int sid) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.openSession();
		
		Transaction trnx = session.beginTransaction();
		
		Laptop lap = (Laptop) session.get(Laptop.class, lid);
		
		Student student = (Student) session.get(Student.class, sid);
		
		Set<Laptop> laptop = new HashSet<Laptop>();
		
		if(student.getLap() == null)
		{
			student.setLap(laptop);
		}
	
		//student.setLap(lap);
		
		student.getLap().add(lap);
		
		session.update(student);
		
		trnx.commit();
		
		session.close();
		
		
		
		
	}

	public List<Student> displayAllStudents() {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.openSession();
		
		Query query = (Query) session.createQuery("from Student");
		
		List<Student> list = new ArrayList();
		
		list = query.list();
		
		session.close();
		
		return list;
	}

	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		
		Session session = sessionFactory.openSession();
		
		student = (Student) session.get(Student.class, id);
		
		session.close();
		
		return student;
	}

	public void addAddress(Integer sid, Integer aid) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.openSession();
		
		Transaction tran = session.beginTransaction();
		
		Address address = (Address) session.get(Address.class, aid);
		
		Student student = (Student) session.get(Student.class, sid);
		
		student.setAddress(address);
		
		session.update(student);
		
		tran.commit();
		
		session.close();
		
	}

	public void addAccount(int sid, int aid) {
		// TODO Auto-generated method stub
		
	Session session = sessionFactory.openSession();
		
		Transaction trnx = session.beginTransaction();
		
		BankAccount account = (BankAccount) session.get(BankAccount.class, aid);
		
		Student student = (Student) session.get(Student.class, sid);
		
		Set<BankAccount> acc = new HashSet<BankAccount>();
		
		if(student.getLap() == null)
		{
			student.setAccounts(acc);
		}
	
		//student.setLap(lap);
		
		student.getAccounts().add(account);
		
		session.update(student);
		
		trnx.commit();
		
		session.close();
		
	}

}
