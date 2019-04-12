package com.srikanth.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.srikanth.Model.Laptop;

import com.srikanth.Service.Impl.LaptopServiceImpl;


@Controller
public class LaptopController {

	@Autowired
	LaptopServiceImpl laptopService;
	
	@RequestMapping("/CreateLaptop")
	public ModelAndView registerStudents(Model model)
	{
		//System.out.println("service obj = "+service);
		
		//model.addAttribute("customer", new Customer());
		ModelAndView m = new ModelAndView();

		m.addObject("laptop", new Laptop());
		
		m.setViewName("RegisterLaptop.jsp");
		
		return m;
	
		
	}
	
	@RequestMapping(value="/LaptopSuccess", method=RequestMethod.POST)
	public String registerSuccess(@ModelAttribute("laptop") Laptop laptop , Model model ) {
		
	
		
		//System.out.println(customer.getName());
		//System.out.println(customer.getCity());
		
		
		
		model.addAttribute("laptop", laptop);
		
		laptopService.addLaptop(laptop);
		
		
		return "DisplayLaptopDetails.jsp";
	}
	

	
}
