package org.example.e190;

import java.util.LinkedHashMap;

public class E190Map {
    public static void main(String[] args) {

        LinkedHashMap<String,String> detail = new LinkedHashMap<>();

        detail.put("Street","Patrick ST");
        detail.put("Suite","265");
        detail.put("City","Vienna");
        detail.put("Zip code","22180");
        detail.put("Country","United States");

        System.out.println("Address Details:");

        System.out.println(detail.get("Street"));
        System.out.println(detail.get("Suite"));
        System.out.println(detail.get("City"));
        System.out.println(detail.get("Zip code"));
        System.out.println(detail.get("Country"));

    }
}