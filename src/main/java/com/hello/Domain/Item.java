package com.hello.Domain;

/**
 * Created by fatimam on 15/10/2017.
 */

public class Item {

  //  private String itemID;


    private PersonDetails personDetails;

    private Address address;
  //  @JoinColumn(name = "contactid", table = "contact_details")
    private ContactDetails contactDetails;
  // @JoinColumn(name = "category_id", table = "main_categories")
    private MainCategories mainCategories;
  //  @JoinColumn(name = "sub_category_id", table = "sub_categories")
    private SubCategories subCategories;
   // @JoinColumn(name = "business_id", table = "business_details")
    private BusinessDetails businessDetails;

    public Item(){}

//    public String getItemID() {
//        return itemID;
//    }

    public PersonDetails getPersonDetails() {
        return personDetails;
    }

    public Address getAddress() {
        return address;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public MainCategories getMainCategories() {
        return mainCategories;
    }

    public SubCategories getSubCategories() {
        return subCategories;
    }

    public BusinessDetails getBusinessDetails() {
        return businessDetails;
    }

    private Item(Builder builder)
    {
       // this.itemID=builder.itemID;
        this.address = builder.address;
        this.contactDetails = builder.contactDetails;
        this.personDetails=builder.personDetails;
        this.mainCategories=builder.mainCategories;
        this.subCategories=builder.subCategories;
        this.businessDetails=builder.businessDetails;
    }

    public static class Builder {
     //   private String itemID;
        private PersonDetails personDetails;
        private Address address;
        private MainCategories mainCategories;
        private ContactDetails contactDetails;
        private SubCategories subCategories;
        private BusinessDetails businessDetails;


//        public Builder itemID(String value) {
//            this.itemID = value;
//            return this;
//        }

        public Builder businessDetails(BusinessDetails value)
        {
            this.businessDetails=value;
            return this;
        }

        public Builder personDetails(PersonDetails value) {
            this.personDetails = value;
            return this;
        }

        public Builder address(Address value) {
            this.address = value;
            return this;
        }

        public Builder contactDetails(ContactDetails value) {
            this.contactDetails = value;
            return this;
        }

        public Builder mainCategories(MainCategories value) {
            this.mainCategories = value;
            return this;
        }

        public Builder subCategories(SubCategories value) {
            this.subCategories = value;
            return this;
        }

        public Item build() {
            return new Item(this);
        }
    }
}