package com.hello.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by fatimam on 01/10/2017.
 */
@Entity
public class BusinessDetails implements Serializable {

    @Id
    private String businessId;
    private String businessName;
    private String businessDescription;

    public BusinessDetails() {
    }


    public String getBusinessId() {
        return businessId;
    }


    public String getBusinessName() {
        return businessName;
    }

    public String getBusinessDescription() {
        return businessDescription;
    }

    private BusinessDetails(Builder builder)
    {
        this.businessId = builder.businessID;
        this.businessName = builder.businessName;
        this.businessDescription=builder.businessDescription;


    }

    public static class Builder{
        private String businessID;
        private String businessName;
        private String businessDescription;

        public Builder businessID(String value)
        {
            this.businessID = value;
            return this;
        }

        public Builder businessName(String value)
        {
            this.businessName = value;
            return this;
        }

        public Builder businessDescription(String value)
        {
            this.businessDescription=value;
            return this;
        }

        public BusinessDetails build(){
            return new BusinessDetails(this);
        }



        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            BusinessDetails businessDetails = (BusinessDetails) o;

            return businessID.equals(businessDetails.businessId);
        }

        @Override
        public int hashCode() {
            return businessID.hashCode();
        }

    }
}
