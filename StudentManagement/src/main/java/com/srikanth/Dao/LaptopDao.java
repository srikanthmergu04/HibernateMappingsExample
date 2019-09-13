package com.srikanth.Dao;

import com.srikanth.Model.Laptop;

import java.util.List;

public interface LaptopDao {

    public int addLaptop(Laptop laptop);

    public List<Laptop> displayAllLaptops();

}
