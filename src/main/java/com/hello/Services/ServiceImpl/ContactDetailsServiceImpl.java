package com.hello.Services.ServiceImpl;

import com.hello.Domain.ContactDetails;
import com.hello.Repository.ContactDetailsRepository;
import com.hello.Services.ContactDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by fatimam on 01/10/2017.
 */
@Component
public class ContactDetailsServiceImpl implements ContactDetailsService {

    @Autowired
    ContactDetailsRepository contactDetailsRepository;

    @Override
    public ContactDetails save(ContactDetails entity) {
        return contactDetailsRepository.save(entity);
    }

    @Override
    public ContactDetails findById(String s) {
        return contactDetailsRepository.findOne(s);
    }

    @Override
    public ContactDetails update(ContactDetails entity) {
        return contactDetailsRepository.save(entity);
    }

    @Override
    public void delete(String s) {
        contactDetailsRepository.delete(s);
    }
}
