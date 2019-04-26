package com.srikanth.Service.Impl;

import java.util.ArrayList;
import java.util.List;

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

	public List<Student> displayAllStudents() {
		// TODO Auto-generated method stub
		
		List<Student> list = new ArrayList();
		
		list = StudentDao.displayAllStudents();
		
		return list;
	}

	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		
		student = StudentDao.getStudentById(id);
		
		return student;
	}

	public void addAddress(Integer sid, Integer aid) {
		// TODO Auto-generated method stub
		
		StudentDao.addAddress(sid, aid);
		
	}

	public void addAccount(int sid, int aid) {
		// TODO Auto-generated method stub
		
		StudentDao.addAccount(sid, aid);
		
	}

}
