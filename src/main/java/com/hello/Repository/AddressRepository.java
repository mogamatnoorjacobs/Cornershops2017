package com.hello.Repository;

import com.hello.Domain.Address;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by fatimam on 04/09/2017.
 */
public interface AddressRepository extends CrudRepository<Address,String> {
}
