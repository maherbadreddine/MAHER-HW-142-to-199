# Exercise: Basic Exception Handling in Java

## Objective
Learn how to use try-catch blocks to handle exceptions in Java.

## Instructions

1. Create a class called `ExceptionExample` with a `main` method.
2. In the `main` method:
    - Create an array of integers with 5 elements.
    - Use a try-catch block to:
        - Try to access the 6th element of the array (which doesn't exist).
        - Catch the `ArrayIndexOutOfBoundsException` that will be thrown.
    - In the catch block, print an error message explaining what went wrong.
3. After the try-catch block, print a message saying the program has finished.

## Example Output
```
Trying to access an element...
Error: Array index is out of bounds
Program has finished
```

## Key Points to Remember
- The try block contains code that might throw an exception.
- The catch block handles the exception if it occurs.
- You can have multiple catch blocks for different types of exceptions.
- Code after the try-catch block will execute whether an exception occurred or not.
