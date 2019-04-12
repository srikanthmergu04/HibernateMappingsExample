package com.srikanth.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.srikanth.Dao.Impl.LaptopDaoImpl;
import com.srikanth.Model.Laptop;
import com.srikanth.Service.LaptopService;

public class LaptopServiceImpl implements LaptopService {

	@Autowired
	LaptopDaoImpl LaptopDao;
	
	public int addLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		
		LaptopDao.addLaptop(laptop);
		
		
		
		return 0;
	}

}
