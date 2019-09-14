package com.srikanth.Controller;

import com.srikanth.Model.Laptop;
import com.srikanth.Service.Impl.LaptopServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/LaptopService")
public class LaptopController {

    @Autowired
    LaptopServiceImpl laptopService;


    @RequestMapping(value = "/registerLaptop", method = RequestMethod.POST)
    public Laptop registerSuccess(@RequestBody Laptop laptop) {//@RequestParam("lbrand") String lbrand , @RequestParam("ram") String ram , @RequestParam("cost") Integer cost



        /*
         * Laptop laptop = new Laptop(); laptop.setLbrand(lbrand); laptop.setRam(ram);
         * laptop.setCost(cost);
         */

        laptopService.addLaptop(laptop);

        return laptop;
    }

    @RequestMapping(value = "/getLaptopDetails", method = RequestMethod.GET)
    public List<Laptop> DisplayAllStudents(Model model) {
        List<Laptop> list = new ArrayList();

        list = laptopService.displayAllLaptops();


        return list;

    }


}
