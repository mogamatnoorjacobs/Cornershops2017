package com.hello.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by noor on 07/08/2017.
 */
@Entity
public class SubCategories implements Serializable, CategoryInterface{
    @Id
    private String subCategoryId;
    private String subCategory;
   // private String mainCategoriesId;             //Foreign Key

    public SubCategories() {
    }


    public String getCatergoryId() {
        return subCategoryId;
    }


    public String getCategory() {
        return subCategory;
    }

//    public String getMainCategoriesId() {
//
//          return mainCategoriesId;
//    }

    private SubCategories(Builder builder)
    {
        this.subCategoryId = builder.subCategoryId;
        this.subCategory = builder.subCategory;
       // this.mainCategoriesId=builder.mainCategoriesId;

    }

    public static class Builder{
        private String subCategoryId;
        private String subCategory;
      //  private String mainCategoriesId;


        public Builder subCategoryId(String value)
        {
            this.subCategoryId = value;
            return this;
        }

        public Builder subCategory(String value)
        {
            this.subCategory = value;
            return this;
        }

//        public Builder mainCategoriesId(String value)
//        {
//           this.mainCategoriesId=value;
//            return this;
//        }

        public SubCategories build(){
            return new SubCategories(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SubCategories subCategories = (SubCategories) o;

            return subCategoryId.equals(subCategories.subCategoryId);
        }

        @Override
        public int hashCode() {
            return subCategoryId.hashCode();
        }

    }
}