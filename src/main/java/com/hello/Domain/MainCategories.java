package com.hello.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by fatimam on 24/09/2017.
 */

@Entity
public class MainCategories implements Serializable,CategoryInterface {
    @Id
    private String categoryId;
    private String category;

    public MainCategories() {
    }


    public String getCatergoryId() {
        return categoryId;
    }


    public String getCategory() {
        return category;
    }


    private MainCategories(Builder builder)
    {
        this.categoryId = builder.categoryId;
        this.category = builder.category;

    }

    public static class Builder{
        private String categoryId;
        private String category;


        public Builder categoryId(String value)
        {
            this.categoryId = value;
            return this;
        }

        public Builder category(String value)
        {
            this.category = value;
            return this;
        }


        public MainCategories build(){
            return new MainCategories(this);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MainCategories mainCategories = (MainCategories) o;

            return categoryId.equals(mainCategories.categoryId);
        }

        @Override
        public int hashCode() {
            return categoryId.hashCode();
        }

    }


}
