package com.srikanth.Service.Impl;

import com.srikanth.Dao.Impl.StudentDaoImpl;
import com.srikanth.Model.Student;
import com.srikanth.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDaoImpl studentDao;

    public int addStudent(Student student) {
        // TODO Auto-generated method stub

        studentDao.addStudent(student);

        return 0;
    }

    public void addLaptop(int lid, int sid) {
        // TODO Auto-generated method stub

        studentDao.addLaptop(lid, sid);

    }

    public List<Student> displayAllStudents() {
        // TODO Auto-generated method stub

        List<Student> list = new ArrayList();

        list = studentDao.displayAllStudents();

        return list;
    }

    public Student getStudentById(int id) {
        // TODO Auto-generated method stub

        Student student = new Student();

        student = studentDao.getStudentById(id);

        return student;
    }

    public void addAddress(Integer sid, Integer aid) {
        // TODO Auto-generated method stub

        studentDao.addAddress(sid, aid);

    }

    public void addAccount(int sid, int aid) {
        // TODO Auto-generated method stub

        studentDao.addAccount(sid, aid);

    }

}
