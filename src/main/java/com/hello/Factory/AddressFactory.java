package com.hello.Factory;

import com.hello.Domain.Address;

/**
 * Created by fatimam on 04/09/2017.
 */
public class AddressFactory {
    public static Address getAddress(String addressID,String streetNumber,String streetName,String area,String suburb,String city){
        Address address = new Address.Builder()
                .addressId(addressID)
                .streetNumber(streetNumber)
                .streetName(streetName)
                .area(area)
                .suburb(suburb)
                .city(city)
                .build();
        return address;
    }

    public static Address searchAddress(String addressID){
        Address address = new Address.Builder()
                .addressId(addressID)
                .build();
        return address;
    }

}
