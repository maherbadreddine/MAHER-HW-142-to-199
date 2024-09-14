package org.example.e197;


import java.util.HashMap;
import java.util.Map;

// Step 1: Define the Dog class
class Dog {
    String name;
    String breed;
    int age;

    // Constructor
    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    // Override the toString() method
    @Override
    public String toString() {
        return "Dog{name='" + name + "', breed='" + breed + "', age=" + age + "}";
    }
}

public class E197Map {

    public static void main(String[] args) {
        // Step 2: Initialize the Map and Store Dog Objects
        Map<Integer, Dog> dogMap = new HashMap<>();

        // Create Dog objects and add them to the map
        dogMap.put(1, new Dog("Max", "Labrador", 5));
        dogMap.put(2, new Dog("Bella", "Beagle", 3));
        dogMap.put(3, new Dog("Rocky", "Bulldog", 4));

        // Step 3: Retrieve and Print Dog Information
        for (Map.Entry<Integer, Dog> entry : dogMap.entrySet()) {
            System.out.println("Dog ID: " + entry.getKey() + ", Details: " + entry.getValue());
        }
    }
}
