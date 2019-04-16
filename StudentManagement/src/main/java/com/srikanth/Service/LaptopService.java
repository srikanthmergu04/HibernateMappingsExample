package com.srikanth.Service;

import java.util.List;

import com.srikanth.Model.Laptop;

public interface LaptopService {
	
	public int addLaptop(Laptop laptop);
	
	public List<Laptop> displayAllLaptops();

}
