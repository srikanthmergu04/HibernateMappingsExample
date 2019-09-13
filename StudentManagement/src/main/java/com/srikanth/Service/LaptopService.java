package com.srikanth.Service;

import com.srikanth.Model.Laptop;

import java.util.List;

public interface LaptopService {

    public int addLaptop(Laptop laptop);

    public List<Laptop> displayAllLaptops();

}
