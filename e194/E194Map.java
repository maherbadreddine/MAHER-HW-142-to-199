package org.example.e194;

import java.util.HashMap;
import java.util.Map;

public class E194Map {
    public static void main(String[] args) {
        HashMap<Integer,String> studentId = new HashMap<>();

        studentId.put(101,"John");
        studentId.put(102,"Emily");
        studentId.put(103,"Michael");
        studentId.put(104,"Sarah");
        studentId.put(105,"David");

        System.out.println("Student IDs:");
        for(Integer id: studentId.keySet()){
            System.out.println("Student ID: " +id);
        }

        System.out.println();
        System.out.println("Student Names:");

        for(String name : studentId.values() ){
            System.out.println("Student Name: " + name);
        }

        System.out.println();
        System.out.println("Student Records:");
        for(Map.Entry<Integer,String> entry: studentId.entrySet()){
            System.out.println("Student ID: " + entry.getKey()+ ", Student Name: " + entry.getValue());
        }

    }

}
