package com.hello.Services.ServiceImpl;

import com.hello.Domain.Address;
import com.hello.Repository.AddressRepository;
import com.hello.Services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by fatimam on 04/09/2017.
 */

@Component
public class AddressServiceImpl implements AddressService{

@Autowired
    private AddressRepository addressRepository;

    @Override
    public Address save(Address entity) {
        return addressRepository.save(entity);
    }

    @Override
    public Address findById(String s) {

        return addressRepository.findOne(s);
    }


    @Override
    public Address update(Address entity) {
        return addressRepository.save(entity);
    }

    @Override
    public void delete(String s) {
        addressRepository.delete(s);
    }
}


