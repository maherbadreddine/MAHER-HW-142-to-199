package org.example.e199;

public class E199Exceptions {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Trying to access an element...");

        // Step 2: Use a try-catch block to handle the ArrayIndexOutOfBoundsException
        try {
            // Attempt to access the 6th element (index 5) which doesn't exist
            int number = numbers[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            // Step 3: Catch the exception and print an error message
            System.out.println("Error: Array index is out of bounds");
        }

        // Step 4: Print a message saying the program has finished
        System.out.println("Program has finished");
    }
}