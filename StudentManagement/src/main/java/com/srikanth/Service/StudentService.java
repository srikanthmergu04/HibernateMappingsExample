package com.srikanth.Service;


import java.util.List;

import com.srikanth.Model.Student;

public interface StudentService {
	
	public int addStudent(Student student);
	
	public void addLaptop(int lid , int sid);
	
	public List<Student> displayAllStudents();

}
