package org.example.e192;

import java.util.TreeMap;

public class E192Map {
    public static void main(String[] args){

        TreeMap<String,String> detail = new TreeMap<>();

        detail.put("1 item" ,"apple");
        detail.put("2 item" , "banana");
        detail.put("3 item" , "pear");
        detail.put("4 item" , "tomato");
        detail.put("5 item" , "mango");
        detail.put("6 item" ,"kiwi");

        detail.forEach((x,y)-> System.out.println("Key is "+x+" and "+"value is " +y));


    }

}