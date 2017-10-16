package com.hello.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by noor on 07/08/2017.
 */
@Entity
public class Products implements Serializable{
    @Id
    private String productID;
    private String productName;
    private String productDescription;
    private String subCategoriesId;

    public Products(){}

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getSubCategoriesId() {
        return subCategoriesId;
    }

    private Products(Builder builder)
    {
        this.productID = builder.productID;
        this.productName = builder.productName;
        this.productDescription = builder.productDescription;
        this.subCategoriesId=builder.subCategoriesId;
    }

    public static class Builder{
        private String productID;
        private String productName;
        private String productDescription;
        private String subCategoriesId;


        public Builder productID(String value)
        {
            this.productID = value;
            return this;
        }

        public Builder productName(String value)
        {
            this.productName = value;
            return this;
        }

        public Builder productDescription(String value)
        {
            this.productDescription = value;
            return this;
        }
        public Builder subCategoriesid(String value)
        {
            this.subCategoriesId=value;
            return this;
        }

        public Products build(){
            return new Products(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Products products = (Products) o;

            return productID.equals(products.productID);
        }

        @Override
        public int hashCode() {
            return productID.hashCode();
        }

    }


}