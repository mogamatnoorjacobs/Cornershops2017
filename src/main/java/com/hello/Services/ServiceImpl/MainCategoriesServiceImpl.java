package com.hello.Services.ServiceImpl;

import com.hello.Domain.MainCategories;
import com.hello.Repository.MainCategoriesRepository;
import com.hello.Services.MainCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by fatimam on 24/09/2017.
 */
@Component
public class MainCategoriesServiceImpl implements MainCategoriesService
{
    @Autowired
    private MainCategoriesRepository mainCategoriesRepository;

    @Override
    public MainCategories save(MainCategories entity)
    {
        return mainCategoriesRepository.save(entity);
    }

    @Override
    public MainCategories findById(String s)
    {
        return mainCategoriesRepository.findOne(s);
    }


    @Override
    public MainCategories update(MainCategories entity)
    {
        return mainCategoriesRepository.save(entity);
    }

    @Override
    public void delete(String s)
    {
        mainCategoriesRepository.delete(s);
    }

}
