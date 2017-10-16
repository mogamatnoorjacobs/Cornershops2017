package com.hello.Domain;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;



/**
 * Created by fatimam on 29/09/2017.
 */
@Entity
public class PersonDetails implements Serializable {
    @Id
    private String personID;
    private String firstName;
    private String lastName;

    public PersonDetails() {
    }
    public String getPersonID() {
        return personID;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private PersonDetails(Builder builder)
    {
        this.personID = builder.personID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    public static class Builder{
        private String personID;
        private String firstName;
        private String lastName;


        public Builder personID(String value)
        {
            this.personID = value;
            return this;
        }

        public Builder firstName(String value)
        {
            this.firstName = value;
            return this;
        }

        public Builder lastName(String value)
        {
            this.lastName = value;
            return this;
        }



        public PersonDetails build(){
            return new PersonDetails(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PersonDetails personDetails = (PersonDetails) o;

            return personID.equals(personDetails.personID);
        }

        @Override
        public int hashCode() {
            return personID.hashCode();
        }

    }

}
