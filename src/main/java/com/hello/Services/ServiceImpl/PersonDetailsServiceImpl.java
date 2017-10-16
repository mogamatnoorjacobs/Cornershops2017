package com.hello.Services.ServiceImpl;


import com.hello.Domain.PersonDetails;
import com.hello.Repository.PersonDetailsRepository;
import com.hello.Services.PersonDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by fatimam on 01/10/2017.
 */
@Component
public class PersonDetailsServiceImpl implements PersonDetailsService {

    @Autowired
    PersonDetailsRepository personDetailsRepository;

    @Override
    public PersonDetails save(PersonDetails entity)
    {
        return personDetailsRepository.save(entity);
    }

    @Override
    public PersonDetails findById(String id)
    {
        return personDetailsRepository.findOne(id);
    }

    @Override
    public PersonDetails update(PersonDetails entity)
    {
        return personDetailsRepository.save(entity);
    }

    @Override
    public void delete(String s)
    {
        personDetailsRepository.delete(s);
    }
}
