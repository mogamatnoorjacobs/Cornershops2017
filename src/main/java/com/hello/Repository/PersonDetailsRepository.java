package com.hello.Repository;

import com.hello.Domain.PersonDetails;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by fatimam on 01/10/2017.
 */
public interface PersonDetailsRepository extends CrudRepository<PersonDetails,String>
{

}
