package com.hello.Factory;

import com.hello.Domain.BusinessDetails;

import java.util.Map;

/**
 * Created by fatimam on 01/10/2017.
 */
public class BusinessDetailsFactory {
    public static BusinessDetails getBusinessDetails(Map<String, String> values)
    {
        BusinessDetails businessDetails=new BusinessDetails.Builder()
                .businessID(values.get("businessId"))
                .businessName(values.get("businessName"))
                .businessDescription(values.get("businessDescription"))
                .build();
        return businessDetails;

    }
}
