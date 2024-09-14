package org.example.e186;

import java.util.HashSet;

public class E186Set {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();
        names.add("third");
        names.add("second");
        names.add("first");

        System.out.println(names);
        names.clear();
        System.out.println(names);
    }

}