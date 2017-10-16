package com.hello.Factory;

import com.hello.Domain.PersonDetails;

/**
 * Created by fatimam on 30/09/2017.
 */
public class PersonDetailsFactory {

    public static PersonDetails getPersonDetails(String personID, String firstName, String lastName)
    {
        PersonDetails personDetails=new PersonDetails.Builder()
                .personID(personID)
                .firstName(firstName)
                .lastName(lastName)
                .build();
        return personDetails;
    }
}
