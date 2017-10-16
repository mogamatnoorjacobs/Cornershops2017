package com.hello.Services.ServiceImpl;

import com.hello.Domain.Products;
import com.hello.Repository.ProductsRepository;
import com.hello.Services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by fatimam on 24/09/2017.
 */
@Component
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    ProductsRepository productsRepository;

    @Override
    public Products save(Products entity) {
        return productsRepository.save(entity);
    }

    @Override
    public Products findById(String s) {

        return productsRepository.findOne(s);
    }


    @Override
    public Products update(Products entity) {
        return productsRepository.save(entity);
    }

    @Override
    public void delete(String s) {
        productsRepository.delete(s);
    }
}

