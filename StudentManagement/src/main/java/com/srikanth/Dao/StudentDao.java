package com.srikanth.Dao;

import com.srikanth.Model.Student;

public interface StudentDao {
	
	public int addStudent(Student student);
	
	public void addLaptop(int lid , int sid);

}
