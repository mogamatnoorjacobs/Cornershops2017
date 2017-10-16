package com.hello.Repository;

import com.hello.Domain.BusinessDetails;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by fatimam on 01/10/2017.
 */
public interface BusinessDetailsRepository extends CrudRepository<BusinessDetails,String> {
}
