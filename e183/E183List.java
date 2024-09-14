package org.example.e183;

import java.util.LinkedList;

public class E183List {

    public static void main(String[] args) {

        LinkedList<Integer> monthlySalary = new LinkedList<>();
        monthlySalary.add(11100);
        monthlySalary.add(12200);
        monthlySalary.add(13300);
        monthlySalary.add(14400);
        monthlySalary.add(15500);
        monthlySalary.add(16600);
        int sum = 0;
        for(int monthlysalary : monthlySalary){
            sum += monthlysalary;
        }
        System.out.println("Total sales for the year: " +sum);

    }

}