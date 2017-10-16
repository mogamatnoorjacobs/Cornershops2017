package com.hello.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by fatimam on 01/10/2017.
 */
@Entity
public class ContactDetails implements Serializable {

    @Id
    private String contactID;
    private String cellNumber;
    private String homeNumber;
    private String emailAddress;
    private String website;
    private String otherLinks;

    public ContactDetails() {
    }

    public String getContactID()
    {
        return contactID;
    }
    public String getCellNumber() {
        return cellNumber;
    }


    public String getHomeNumber() {
        return homeNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getWebsite()
    {
        return website;

    }

    public String getOtherLinks()
    {
        return otherLinks;
    }

    public ContactDetails(Builder builder)
    {
        contactID=builder.contactID;
        cellNumber = builder.cellNumber;
        homeNumber = builder.homeNumber;
        emailAddress= builder.emailAddress;
        website=builder.website;
        otherLinks=builder.otherLinks;
    }

    public static class Builder{
        private String contactID;
        private String cellNumber;
        private String homeNumber;
        private String emailAddress;
        private String website;
        private String otherLinks;

        public Builder contactID(String value)
        {
            this.contactID=value;
            return this;
        }


        public Builder cellNumber(String value)
        {
            this.cellNumber = value;
            return this;
        }

        public Builder homeNumber(String value)
        {
            this.homeNumber = value;
            return this;
        }

        public Builder emailAddress(String value)
        {
            this.emailAddress= value;
            return this;
        }

        public Builder website(String value)
        {
            this.website=value;
            return this;
        }

        public Builder otherLinks(String value)
        {
            this.otherLinks=value;
            return this;
        }


        public ContactDetails build(){
            return new ContactDetails(this);
        }

    }
}
