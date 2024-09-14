# Exercise: Using Final Methods in Java

## Objective
Understand how to use the `final` keyword to prevent method overriding and how to implement final methods in Java.

## Instructions

**Step 1: Create the `StringManipulator` Class**

1. **Create the `StringManipulator.java` class** with the following:
    - **Instance Variable:**
        - Declare an instance variable `str` to store a string.
    - **Constructor:**
        - Initialize the `str` variable through the constructor.
    - **Final Method: Reverse String**
        - Create a `final` method named `reverseString` that takes no parameters.
        - This method should return the reverse of the string stored in the `str` variable.
        - Example: If `str` is `"hello"`, the method should return `"olleh"`.

**Step 2: Create the `ArrayManipulator` Class**

1. **Create the `ArrayManipulator.java` class** with the following:
    - **Final Method: Calculate Average**
        - Create a `final` method named `avgElements` that accepts an integer array.
        - The method should calculate and return the average of the array's elements.
        - Example: For an array `{3, 4, 5, 6, 6}`, the method should return `4.8`.

**Step 3: Test the Methods in the `E163FinalKeywordDemo` Class**

1. **In the `E163FinalKeywordDemo.java` class:**
    - **Main Method:**
        - Create an object of the `StringManipulator` class and call the `reverseString` method.
        - Create an object of the `ArrayManipulator` class and call the `avgElements` method.
    - **Expected Output:**
        - The output should show the results of each method:
            - `"olleh"` (from reversing the string `"hello"`)
            - `"4.8"` (from averaging the array `{3, 4, 5, 6, 6}`)

   **Example Output:**
    - ```
      olleh
      4.8
      ```

**Step 4: Run Your Application**

1. Execute your program to verify that the output matches the expected result.

## Tips:

- **Final Methods:** The `final` keyword ensures that a method cannot be overridden in any subclass.
- **String and Array Operations:** Practice reversing strings and calculating averages, common tasks in programming.

By completing this exercise, you will learn how to use the `final` keyword in methods to prevent them from being overridden and apply this knowledge to common programming tasks. Happy coding!
