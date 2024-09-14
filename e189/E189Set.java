package org.example.e189;

import java.util.LinkedHashSet;

public class E189Set {
    public static void main(String[] args) {

        LinkedHashSet<String> emails = new LinkedHashSet<>();

        emails.add("null");
        emails.add("john.doe@example.com");
        emails.add("jane.smith@example.com");
        emails.add("john.doe@example.com");
        emails.add("admin@event.com");
        emails.add("info@company.com");

        System.out.println("Email List using For-Each:");
        for(String i :emails) {


            System.out.println(i);


        }
    }
}