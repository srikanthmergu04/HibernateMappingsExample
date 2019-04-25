package com.srikanth.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.srikanth.Model.Laptop;
import com.srikanth.Model.Student;
import com.srikanth.Service.Impl.LaptopServiceImpl;


@RestController
public class LaptopController {

	@Autowired
	LaptopServiceImpl laptopService;
	
	
	@RequestMapping(value="/registerLaptop", method=RequestMethod.POST)
	public Laptop registerSuccess(@RequestParam("lbrand") String lbrand , @RequestParam("ram") String ram , @RequestParam("cost") Integer cost) {
		
	
		
		Laptop laptop = new Laptop();
		
		laptop.setLbrand(lbrand);
		laptop.setRam(ram);
		laptop.setCost(cost);
		
		
		laptopService.addLaptop(laptop);
		
		
		return laptop;
	}
	
	@RequestMapping(value = "/LaptopDetails" , method = RequestMethod.GET)
	public List<Laptop> DisplayAllStudents(Model model)
	{
		List<Laptop> list = new ArrayList();
		
		list = laptopService.displayAllLaptops();

		
		return list;
		
	}
	

	
}
