package com.hello.Factory;

import com.hello.Domain.Products;

import java.util.Map;

/**
 * Created by Mogamat Noor Jacobs on 12/08/2017.
 */
public class ProductsFactory {
    public static Products getProducts(Map<String, String> values){
        Products products = new Products.Builder()
                .productID(values.get("productID"))
                .productName(values.get("productName"))
                .productDescription(values.get("productDescription"))
                .subCategoriesid(values.get("subCategoriesId"))
                .build();
        return products;
    }
}