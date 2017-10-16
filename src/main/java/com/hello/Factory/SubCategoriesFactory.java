package com.hello.Factory;

import com.hello.Domain.SubCategories;

import java.util.Map;

/**
 * Created by Mogamat Noor Jacobs on 12/08/2017.
 */
public class SubCategoriesFactory {
    public static SubCategories getSubCategories(Map<String, String> values){
        SubCategories subCategories = new SubCategories.Builder()
                .subCategoryId(values.get("subCategoryId"))
                .subCategory(values.get("subCategory"))
               // .mainCategoriesId(values.get("mainCategoriesId"))
                .build();
        return subCategories;
    }
}
