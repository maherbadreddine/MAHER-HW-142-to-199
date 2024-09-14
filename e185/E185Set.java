package org.example.e185;

import java.util.HashSet;

public class E185Set {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1001);
        numbers.add(1002);
        numbers.add(1001);
        numbers.add(1003);
        numbers.add(1002);
        numbers.add(1004);

        for (Integer i :numbers) {

            System.out.println(i);
        }
    }
}
