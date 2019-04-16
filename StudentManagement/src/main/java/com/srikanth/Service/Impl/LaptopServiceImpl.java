package com.srikanth.Service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.srikanth.Dao.Impl.LaptopDaoImpl;
import com.srikanth.Model.Laptop;
import com.srikanth.Model.Student;
import com.srikanth.Service.LaptopService;

public class LaptopServiceImpl implements LaptopService {

	@Autowired
	LaptopDaoImpl LaptopDao;
	
	public int addLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		
		LaptopDao.addLaptop(laptop);
		
		
		
		return 0;
	}

	public List<Laptop> displayAllLaptops() {
		// TODO Auto-generated method stub
		
		List<Laptop> list = new ArrayList();
		
		list = LaptopDao.displayAllLaptops();
		
		return list;
		
		//return null;
	}

}
