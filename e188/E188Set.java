package org.example.e188;

import java.util.TreeSet;

public class E188Set {

    public static void main(String[] args) {

        TreeSet<String> countryNames = new TreeSet<>();

        countryNames.add("India");
        countryNames.add("Australia");
        countryNames.add("South Africa");
        countryNames.add("India");
        countryNames.add("America");
        countryNames.add("America");

        System.out.println(countryNames);

    }

}