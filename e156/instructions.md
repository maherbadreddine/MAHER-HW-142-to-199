# Exercise: Understanding Variable Shadowing in an Animal Hierarchy

## Objective
Learn how to implement and observe variable shadowing in Java within the context of inheritance. This exercise will help you understand how subclass variables can shadow variables of the same name in a parent class and how to access both variables from within the subclass.

## Instructions

**Step 1: Create the `Animal` Class with a Variable**

1. **Create the `Animal.java` class** with the following:
    - **Variable Declaration:**
        - Declare a `String` variable named `sound` and initialize it with the value `"Some generic animal sound"` to represent the sound any generic animal might make.
    - **Explanation:**
        - The `Animal` class represents a general concept of an animal. The variable `sound` holds the default sound that animals make. This variable will be shadowed by a similar variable in the subclass.

**Step 2: Create the `Dog` Class that Extends `Animal`**

1. **Create the `Dog.java` class** with the following:
    - **Inheritance:** Use the `extends` keyword to make `Dog` a subclass of `Animal`.
    - **Variable Declaration:**
        - Declare a `String` variable named `sound` and initialize it with the value `"Bark"` to represent the specific sound that a dog makes.
    - **Method to Display Variables:**
        - Create a method named `displaySound` that prints the value of the `sound` variable from the `Dog` class, followed by the value of the `sound` variable from the `Animal` class.
        - Use `super.sound` to access the `sound` variable from the `Animal` class.

   **Explanation:**
    - The `Dog` class declares a variable `sound` with the same name as in the `Animal` class, effectively shadowing the parent’s variable. The `displaySound` method shows how to access both the shadowed and the original variable using `super`.

**Step 3: Test the Classes in the `E156SuperKeyword` Class**

1. **Use the existing `E156SuperKeyword.java` class** with the following:
    - **Object Creation:**
        - Create an object of the `Dog` class.
    - **Method Call:**
        - Call the `displaySound` method on the `Dog` object to print the values of `sound` from both `Dog` and `Animal`.
    - **Expected Behavior:**
        - The output should show the value of `sound` from the `Dog` class (which is `"Bark"`), followed by the value of `sound` from the `Animal` class (which is `"Some generic animal sound"`).

   **Example Implementation:**
    - The output sequence should clearly reflect the values of `sound` from both classes:
    - ```
      Bark
      Some generic animal sound
      ```

**Step 4: Run Your Application**

1. Execute your program to verify that the output matches the expected result.

## Tips:

- **Variable Shadowing:** Understand how subclass variables can shadow parent class variables when they have the same name. The `super` keyword is used to access the parent class variable from the subclass.
- **Inheritance:** Recognize how subclass methods can access both shadowed and original variables, providing flexibility in handling inherited attributes.

By completing this exercise, you will gain a clear understanding of variable shadowing in Java inheritance, observing how Java handles variable names in a real-life context of animals and dogs. Happy coding!
