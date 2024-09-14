package org.example.e187;

import java.util.HashSet;

public class E187Set {

    public static void main(String[] args) {

        HashSet<String> colorNames = new HashSet<>();

        colorNames.add("Red");
        colorNames.add("Pink");
        colorNames.add("White");
        colorNames.add("Yellow");
        colorNames.add("Black");

        System.out.println("Original Hash Set: "+colorNames);

        System.out.println("Size of the Hash Set: "+colorNames.size());
    }

}