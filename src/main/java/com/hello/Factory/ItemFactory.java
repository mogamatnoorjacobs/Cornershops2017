package com.hello.Factory;

import com.hello.Domain.*;

/**
 * Created by fatimam on 15/10/2017.
 */
public class ItemFactory {

    public static Item getItem(PersonDetails personDetails, Address address, BusinessDetails businessDetails, ContactDetails contactDetails,MainCategories mainCategories,SubCategories subCategories)
    {


        Item item=new Item.Builder()
                .personDetails(personDetails)
                .address(address)
                .businessDetails(businessDetails)
                .contactDetails(contactDetails)
                .mainCategories(mainCategories)
                .subCategories(subCategories)
                .build();
        return  item;
    }

    public static Item getPersonItem(PersonDetails personDetails)
    {
        Item item=new Item.Builder()
                .personDetails(personDetails)
                .build();
        return  item;
    }

}
