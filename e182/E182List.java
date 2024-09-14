package org.example.e182;


import java.util.LinkedList;

public class E182List {
    public static void main(String[] args) {
        // Step 1: Create a LinkedList to Store Prime Numbers
        LinkedList<Integer> primeNumbers = new LinkedList<>();

        // Step 3: Add All Prime Numbers to the LinkedList
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }

        // Step 4: Print the LinkedList of Prime Numbers
        System.out.println(primeNumbers);
    }

    // Step 2: Create a Method to Check Prime Numbers
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}