package org.example.e191;

import java.util.LinkedHashMap;

public class E191Map {

    public static void main(String[] args) {

        LinkedHashMap<String, Double> storeProductDetail = new LinkedHashMap<>();

        storeProductDetail.put("Laptop:", 1200.99);
        storeProductDetail.put("Smartphone:", 799.99);
        storeProductDetail.put("Tablet:", 499.99);
        storeProductDetail.put("Smartwatch:", 199.99);
        storeProductDetail.put("Headphones:", 149.99);

        System.out.println("Product Catalog:");

        storeProductDetail.forEach((x,y)-> System.out.println(x+" " + "$"+y));

    }

}
