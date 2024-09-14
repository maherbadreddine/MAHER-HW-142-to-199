# Exercise: Implementing an Interface in an Electronic Device System

## Objective
Learn how to use interfaces in Java to define behaviors that multiple classes can implement. You will define an interface with methods for turning on and off electronic devices and implement this interface in different device classes.

## Instructions

**Step 1: Create the `ElectronicDevice` Interface**

1. **Create the `ElectronicDevice.java` interface** with the following:
    - **Unimplemented Methods:**
        - Declare two unimplemented methods:
            - `turnOn()` with no parameters.
            - `turnOff()` with no parameters.

**Step 2: Create a `Smartphone` Class that Implements the Interface**

1. **Create a `Smartphone.java` class** that implements the `ElectronicDevice` interface.
    - **Implement Methods:**
        - Provide an implementation for the `turnOn()` method that prints `"Smartphone is turning on"`.
        - Provide an implementation for the `turnOff()` method that prints `"Smartphone is turning off"`.

**Step 3: Create a `Laptop` Class that Implements the Interface**

1. **Create a `Laptop.java` class** that implements the `ElectronicDevice` interface.
    - **Implement Methods:**
        - Provide an implementation for the `turnOn()` method that prints `"Laptop is turning on"`.
        - Provide an implementation for the `turnOff()` method that prints `"Laptop is turning off"`.

**Step 4: Test the Implementation in the `E157SuperKeyword` Class**

1. **In the `E157SuperKeyword.java` class**:
    - Create an object of the `Smartphone` class and call both the `turnOn()` and `turnOff()` methods.
    - Create an object of the `Laptop` class and call both the `turnOn()` and `turnOff()` methods.

## Example InputOutput:

**Expected Output:**

```plaintext
Smartphone is turning on
Smartphone is turning off
Laptop is turning on
Laptop is turning off
```

**Explanation:**
- The `Smartphone` and `Laptop` classes implement the `ElectronicDevice` interface, providing concrete implementations for the `turnOn` and `turnOff` methods. Each device has its own specific message when these methods are called.

**Step 5: Run Your Application**

1. Execute your program to verify that the output matches the expected result.

## Tips:

- **Interfaces:** An interface defines methods that a class must implement, but it doesn't provide implementations for those methods. Any class that implements the interface must provide its own specific implementations.
- **Real-World Usage:** Interfaces are commonly used to define common behavior across different classes, like in this example where both `Smartphone` and `Laptop` devices can turn on and off, but with their own specific implementation.

By completing this exercise, you will understand how to implement interfaces in Java and how to provide implementations for unimplemented methods in different classes. Happy coding!
