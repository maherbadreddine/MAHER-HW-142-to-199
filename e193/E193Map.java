package org.example.e193;


import java.util.HashMap;

public class E193Map {

    public static void main(String[] args) {

        HashMap<Integer,String> uniqueBookId = new HashMap<>();

        uniqueBookId.put(101,"The Catcher in the Rye");
        uniqueBookId.put(102,"To Kill a Mockingbird");
        uniqueBookId.put(103,"1984");
        uniqueBookId.put(104,"The Great Gatsby");
        uniqueBookId.put(105,"Moby Dick");

        System.out.println("Initial number of books in catalog: " + uniqueBookId.size());
        System.out.println("Is the catalog empty? " + uniqueBookId.isEmpty());
        System.out.println("Is book with ID 102 available? " + uniqueBookId.containsKey(102));
        System.out.println("Is the book \"1984\" available? " + uniqueBookId.containsValue("1984"));
        uniqueBookId.remove(105);
        System.out.println("Updated catalog after removing ID 105:");

        for(Integer id:uniqueBookId.keySet()) {
            System.out.println(id + ": " +uniqueBookId.get(id));
        }
        uniqueBookId.clear();
        System.out.println("Is the catalog empty after clearing? " + uniqueBookId.isEmpty());

    }

}