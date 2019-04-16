package com.srikanth.Dao;

import java.util.List;

import com.srikanth.Model.Laptop;

public interface LaptopDao {
	
	public int addLaptop(Laptop laptop);
	
	public List<Laptop> displayAllLaptops();

}
