package com.srikanth.Dao;

import java.util.List;

import com.srikanth.Model.Student;

public interface StudentDao {
	
	public int addStudent(Student student);
	
	public void addLaptop(int lid , int sid);
	
	public List<Student> displayAllStudents();

}
