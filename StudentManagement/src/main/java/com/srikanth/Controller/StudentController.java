package com.srikanth.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.srikanth.Model.Student;
import com.srikanth.Service.StudentService;
import com.srikanth.Service.Impl.StudentServiceImpl;


@RestController
public class StudentController {
	
	@Autowired
	StudentServiceImpl studentService;

	
	@RequestMapping(value="/RegisterStudent", method=RequestMethod.POST)
	public Student registerSuccess(@RequestParam("name") String name , @RequestParam("age") Integer age , @RequestParam("dept") String dept ) {
		
	
		Student student = new Student();
		
		student.setName(name);
		student.setAge(age);
		student.setDept(dept);
		
			
		studentService.addStudent(student);
		
		return student;
		
	}
	
	@RequestMapping(value = "/addLaptop" , method = RequestMethod.POST)
	public String chooseLaptop(@RequestParam("sid") int sid , @RequestParam("lid") int lid)
	{

		
		System.out.println(" sid = "+sid+" :: "+" lid =  "+lid);
		
		studentService.addLaptop(lid, sid);
		
		return "Laptop Added Successfully";
		
	}
	
	@RequestMapping(value = "/getStudentDetails" , method = RequestMethod.GET)
	public List<Student> DisplayAllStudents()
	{
		List<Student> list = new ArrayList();
		
		list = studentService.displayAllStudents();
		
			return list;
		
		
	}
	
	@RequestMapping(value = "/getStudentById" , method = RequestMethod.GET)
	public Student getStudentById(@RequestParam("id") int id)
	{
		Student student = new Student();
		
		student = studentService.getStudentById(id);
		
		return student;
	}
	
	
	@RequestMapping(value = "/addAddress" , method = RequestMethod.POST)
	public String addAddress(@RequestParam("sid") Integer sid , @RequestParam("aid") Integer aid)
	{
		System.out.println("sid = "+sid+" : :"+" aid = "+aid);
		
		studentService.addAddress(sid, aid);		
		
		return "Address Added Successfully";
		
	}
	
	@RequestMapping(value = "/addAccount" , method = RequestMethod.POST)
	public String addAccount(@RequestParam("sid") int sid , @RequestParam("aid") int aid)
	{

		
		System.out.println(" sid = "+sid+" :: "+" aid =  "+aid);
		
		studentService.addAccount(sid, aid);
		
		return "Account Added Successfully";
		
	}

}
