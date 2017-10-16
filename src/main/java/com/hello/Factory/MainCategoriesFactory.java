package com.hello.Factory;

import com.hello.Domain.MainCategories;

import java.util.Map;

/**
 * Created by fatimam on 24/09/2017.
 */
public class MainCategoriesFactory {
    public static MainCategories getMainCategories(Map<String, String> values){
        MainCategories mainCategories = new MainCategories.Builder()
                .categoryId(values.get("categoryId"))
                .category(values.get("category"))
                .build();
        return mainCategories;
    }
}
