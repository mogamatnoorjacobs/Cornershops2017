package com.hello.Services.ServiceImpl;

import com.hello.Domain.BusinessDetails;
import com.hello.Repository.BusinessDetailsRepository;
import com.hello.Services.BusinessDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by fatimam on 01/10/2017.
 */
@Component
public class BusinessDetailsServiceImpl implements BusinessDetailsService
{
    @Autowired
    private BusinessDetailsRepository businessDetailsRepository;

    @Override
    public BusinessDetails save(BusinessDetails entity) {
        return businessDetailsRepository.save(entity);
    }

    @Override
    public BusinessDetails findById(String s) {
        return businessDetailsRepository.findOne(s);
    }

    @Override
    public BusinessDetails update(BusinessDetails entity) {
        return businessDetailsRepository.save(entity);
    }

    @Override
    public void delete(String s) {
        businessDetailsRepository.delete(s);
    }
}
