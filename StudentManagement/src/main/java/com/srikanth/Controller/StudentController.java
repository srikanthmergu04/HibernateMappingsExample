package com.srikanth.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.srikanth.Model.Student;
import com.srikanth.Service.StudentService;
import com.srikanth.Service.Impl.StudentServiceImpl;

@Controller
public class StudentController {
	
	@Autowired
	StudentServiceImpl studentService;
	
	@RequestMapping("/CreateStudent")
	public ModelAndView registerStudents(Model model)
	{
		//System.out.println("service obj = "+service);
		
		//model.addAttribute("customer", new Customer());
		ModelAndView m = new ModelAndView();

		m.addObject("student", new Student());
		
		m.setViewName("RegisterStudent.jsp");
		
		return m;
	
		
	}
	
	@RequestMapping(value="/StudentSuccess", method=RequestMethod.POST)
	public String registerSuccess(@ModelAttribute("student") Student student , Model model ) {
		
	
		
		//System.out.println(customer.getName());
		//System.out.println(customer.getCity());
		
		
		
		model.addAttribute("student", student);
		
		studentService.addStudent(student);
		
		
		return "DisplayStudentDetails.jsp";
	}
	
	@RequestMapping("/addLaptop")
	public String chooseLaptop(HttpServletRequest req , Model model)
	{
		int sid = Integer.parseInt(req.getParameter("sid"));
		int lid = Integer.parseInt(req.getParameter("lid"));
		
		System.out.println(" sid = "+sid+" :: "+" lid =  "+lid);
		
	   studentService.addLaptop(lid, sid);
		
		return null;
		
	}

}
