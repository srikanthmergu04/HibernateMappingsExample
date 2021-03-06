package com.srikanth.Controller;

import com.srikanth.Model.Address;
import com.srikanth.Service.Impl.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("AddressService")
public class AddressController {

    @Autowired
    AddressServiceImpl addressService;

    @RequestMapping(value = "/registerAddress", method = RequestMethod.POST)
    public Address addAddress(@RequestBody Address address)//@RequestParam("city") String city , @RequestParam("state") String state , @RequestParam("country") String country , @RequestParam("pin") Integer pin
    {
        /*
         * Address address = new Address();
         *
         * address.setCity(city); address.setState(state); address.setCountry(country);
         * address.setPin(pin);
         */

        addressService.addAddress(address);

        return address;

    }

    @RequestMapping(value = "/getAddresses", method = RequestMethod.GET)
    public List<Address> listAllAddresses() {
        return addressService.listAllAddress();

    }

}
