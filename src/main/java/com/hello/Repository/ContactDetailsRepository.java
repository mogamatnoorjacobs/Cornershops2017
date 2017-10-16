package com.hello.Repository;

import com.hello.Domain.ContactDetails;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by fatimam on 01/10/2017.
 */
public interface ContactDetailsRepository extends CrudRepository<ContactDetails,String> {
}
