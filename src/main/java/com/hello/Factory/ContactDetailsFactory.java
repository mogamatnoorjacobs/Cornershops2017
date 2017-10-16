package com.hello.Factory;

import com.hello.Domain.ContactDetails;

import java.util.Map;

/**
 * Created by fatimam on 01/10/2017.
 */
public class ContactDetailsFactory {
    public static ContactDetails getContactDetails(Map<String,String> values)
    {

        ContactDetails contactDetails=new ContactDetails.Builder()
                .contactID(values.get("contactID"))
                .cellNumber(values.get("cellNumber"))
                .homeNumber(values.get("homeNumber"))
                .emailAddress(values.get("emailAddress"))
                .website(values.get("website"))
                .otherLinks(values.get("otherLinks"))
                .build();
        return  contactDetails;
    }


}
