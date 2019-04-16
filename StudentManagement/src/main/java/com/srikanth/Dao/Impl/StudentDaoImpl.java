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

import com.srikanth.Model.Laptop;

public class StudentDaoImpl implements StudentDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public int addStudent(Student student) {
		// TODO Auto-generated method stub
		
	Session session = sessionFactory.openSession();
		
		Transaction trnx = session.beginTransaction();
		
		/*Laptop lap = (Laptop) session.get(Laptop.class, 1);
		
		Set<Laptop> laptop = new HashSet<Laptop>();
	
		if(student.getLap() == null)
		{
			student.setLap(laptop);
		}
	
		//student.setLap(lap);
		
		student.getLap().add(lap);
		
		*/
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
		
		return list;
	}

}
