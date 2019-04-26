package com.srikanth.Dao;

import java.util.List;

import com.srikanth.Model.Student;

public interface StudentDao {
	
	public int addStudent(Student student);
	
	public void addLaptop(int lid , int sid);
	
	public List<Student> displayAllStudents();
	
	public Student getStudentById(int id);
	
	public void addAddress(Integer sid , Integer aid);
	
	public void addAccount(int sid , int aid);

}
