package com.etiya.ecommercedemopair6.business.abstracts;

import com.etiya.ecommercedemopair6.entities.concretes.Address;

import java.util.List;

public interface AddressService {
     Address getById(int id);
     List<Address> getAll();
     List<Address> getAllAddressByTitle(String title);

     Address getAllCitiesByAddresId(int id);
}
