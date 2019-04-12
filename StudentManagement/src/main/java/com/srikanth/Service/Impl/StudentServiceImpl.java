package com.srikanth.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.srikanth.Dao.Impl.StudentDaoImpl;
import com.srikanth.Model.Student;
import com.srikanth.Service.StudentService;

public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDaoImpl StudentDao;

	public int addStudent(Student student) {
		// TODO Auto-generated method stub
		
		StudentDao.addStudent(student);
		
		return 0;
	}

	public void addLaptop(int lid , int sid) {
		// TODO Auto-generated method stub
		
		StudentDao.addLaptop(lid , sid);
		
	}

}
