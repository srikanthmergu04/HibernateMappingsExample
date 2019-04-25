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

//@Controller
@RestController
public class StudentController {
	
	@Autowired
	StudentServiceImpl studentService;

	
	@RequestMapping(value="/RegisterStudent", method=RequestMethod.POST)
	public /*String*/ Student registerSuccess(@RequestParam("name") String name , @RequestParam("age") Integer age , @RequestParam("dept") String dept ) {
		
	
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

}
