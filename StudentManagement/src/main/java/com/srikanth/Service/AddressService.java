package com.srikanth.Service;

import com.srikanth.Model.Address;

import java.util.List;

public interface AddressService {

    public void addAddress(Address address);

    public List<Address> listAllAddress();

}
