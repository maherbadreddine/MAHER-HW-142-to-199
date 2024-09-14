package org.example.e184;


import java.util.ArrayList;

public class E184List {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("USA");
        list.add("Argentina");
        list.add("Kazakhstan");
        list.add("Australia");
        list.add("Pakistan");
        list.add("Russia");

        list.removeIf(n ->(n.charAt(0) == 'A'));


        System.out.print(list+" ");


    }

}
