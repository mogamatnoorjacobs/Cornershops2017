package com.hello.Services.ServiceImpl;

import com.hello.Domain.SubCategories;
import com.hello.Repository.SubCategoriesRepository;
import com.hello.Services.SubCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by fatimam on 24/09/2017.
 */
@Component
public class SubCategoriesServiceImpl implements SubCategoriesService {
    @Autowired
    private SubCategoriesRepository subCategoriesRepository;

    @Override
    public SubCategories save(SubCategories entity) {
        return subCategoriesRepository.save( entity );
    }

    @Override
    public SubCategories findById(String s) {
        return subCategoriesRepository.findOne( s );
    }

    @Override
    public SubCategories update(SubCategories entity)
    {
        return subCategoriesRepository.save(entity);
    }

    @Override
    public void delete(String s)
    {
        subCategoriesRepository.delete(s);
    }


}
