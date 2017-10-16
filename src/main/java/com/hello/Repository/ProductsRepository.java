package com.hello.Repository;

import com.hello.Domain.Products;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by fatimam on 24/09/2017.
 */
public interface ProductsRepository extends CrudRepository<Products,String> {
}
