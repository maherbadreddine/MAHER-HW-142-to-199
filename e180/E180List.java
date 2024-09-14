package org.example.e180;

import java.util.Collections;
import java.util.LinkedList;

public class E180List {
    public static void main(String[] args) {


        LinkedList<Integer> empAges = new LinkedList<>();
        empAges.add(55);
        empAges.add(19);
        empAges.add(30);
        empAges.add(45);
        empAges.add(40);
        empAges.add(65);
        empAges.add(50);
        empAges.add(75);
        empAges.add(60);
        empAges.add(35);

        empAges.removeIf(x -> (x < 20) || (x > 60));


        Collections.sort(empAges);

        int sum = 0;
        double averageAge = 0;
        for (Integer age : empAges) {
            sum += age;
        }
        averageAge = sum / empAges.size();

        System.out.println("Remaining ages: " + empAges);
        System.out.println("Average age: " + averageAge);

    }

}