# Exercise: Implementing Abstract and Non-Abstract Methods in a Vehicle Management System

## Objective
Learn how to use abstract classes and methods in Java, override and implement abstract methods, and call both abstract and implemented methods from the parent class in the child class. In this exercise, you'll manage different types of vehicles, demonstrating inheritance and abstraction.

## Instructions

**Step 1: Create the `Vehicle` Abstract Class**

1. **Create the `Vehicle.java` class** with the following:
   - **Abstract Method:**
      - Declare an abstract method `startEngine()` with no parameters.
   - **Implemented Method:**
      - Create a non-abstract method `stopEngine()` that prints `"Vehicle engine stopped"`.

**Step 2: Create the `Car` Class**

1. **Create the `Car.java` class** as a subclass of `Vehicle`:
   - **Override the `startEngine()` Method:**
      - Provide the implementation for the `startEngine()` method that prints `"Car engine started"`.
   - **Overload the `startEngine()` Method:**
      - Create another version of the `startEngine()` method that takes a `String` parameter (e.g., `keyType`) and prints `"Car engine started with "` followed by the parameter (e.g., `"Car engine started with a smart key"`).

   - **Main Method (In `E164AbstractClass`):**
      - In the `E164AbstractClass`, create an object of the `Car` class.
      - Call both the `startEngine()` and `startEngine(String)` methods.
      - Call the `stopEngine()` method inherited from the `Vehicle` class.

## Example InputOutput:

**Expected Output:**

```plaintext
Car engine started
Car engine started with a smart key
Vehicle engine stopped
```

**Explanation:**
- The `startEngine()` method is abstract in the parent class `Vehicle` and must be implemented in the `Car` class. The method is also overloaded with a version that takes a `String` parameter.
- The `stopEngine()` method is implemented in the `Vehicle` class and inherited by the `Car` class, where it can be called without overriding.

**Step 3: Run Your Application**

1. Execute your program to verify that the output matches the expected result.

## Tips:

- **Abstract Methods:** Abstract methods must be implemented in any subclass that extends the abstract class.
- **Method Overloading and Overriding:** Method overloading allows you to define multiple methods with the same name but different parameters. Overriding is used when the child class provides its own implementation for a method from the parent class.

By completing this exercise, you will gain a clear understanding of how to work with abstract classes, method overriding, and method overloading in a real-life vehicle management system. Happy coding!
