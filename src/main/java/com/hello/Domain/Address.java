package com.hello.Domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by fatimam on 04/09/2017.
 */

@Entity
public class Address implements Serializable {

    @Id
    private String addressId;
    private String streetNumber;
    private String streetName;
    private String area;
    private String suburb;
    private String city;

    public Address() {
    }
    public String getAddressId() {
        return addressId;
    }


    public String getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getArea() {
        return area;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getCity() {
        return city;
    }

    private Address(Builder builder)
    {
        this.addressId = builder.addressId;
        this.streetNumber = builder.streetNumber;
        this.streetName= builder.streetName;
        this.area= builder.area;
        this.suburb=builder.suburb;
        this.city= builder.city;
    }

    public static class Builder{
        private String addressId;
        private String streetNumber;
        private String streetName;
        private String area;
        private String suburb;
        private String city;


        public Builder addressId(String value)
        {
            this.addressId = value;
            return this;
        }

        public Builder streetNumber(String value)
        {
            this.streetNumber = value;
            return this;
        }

        public Builder streetName(String value)
        {
            this.streetName = value;
            return this;
        }
        public Builder area(String value)
        {
            this.area = value;
            return this;
        }
        public Builder suburb(String value)
        {
            this.suburb = value;
            return this;
        }

        public Builder city(String value)
        {
            this.city = value;
            return this;
        }

        public Address build(){
            return new Address(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Address address = (Address) o;

            return addressId.equals(address.addressId);
        }

        @Override
        public int hashCode() {
            return addressId.hashCode();
        }

    }


}
