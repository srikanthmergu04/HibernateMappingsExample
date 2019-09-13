package com.srikanth.Dao;

import com.srikanth.Model.Address;

import java.util.List;

public interface AddressDao {

    public void addAddress(Address address);

    public List<Address> listAllAddress();

}
