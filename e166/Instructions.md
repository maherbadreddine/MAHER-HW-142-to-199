# Exercise: Implementing Multiple Interfaces in a Smart Home Device System

## Objective
Learn how to implement multiple interfaces in Java to define different behaviors for a class. In this exercise, you will define two interfaces representing different actions, and implement both in a single class that simulates a Smart Home Device.

## Instructions

**Step 1: Create the `Controllable` Interface**

1. **Create the `Controllable.java` interface** with the following:
    - **Unimplemented Method:**
        - Declare an unimplemented method `turnOn()` with no parameters, representing the ability to turn on a device.

**Step 2: Create the `Configurable` Interface**

1. **Create the `Configurable.java` interface** with the following:
    - **Unimplemented Method:**
        - Declare an unimplemented method `configure()` with no parameters, representing the ability to configure settings on a device.

**Step 3: Create a `SmartHomeDevice` Class that Implements Both Interfaces**

1. **Create a `SmartHomeDevice.java` class** that implements both the `Controllable` and `Configurable` interfaces.
    - **Implement Methods:**
        - Provide an implementation for the `turnOn()` method that prints `"Turning on Smart Home Device"`.
        - Provide an implementation for the `configure()` method that prints `"Configuring Smart Home Device settings"`.

**Step 4: Test the Implementation in the `E157SuperKeyword` Class**

1. **In the `E157SuperKeyword.java` class**:
    - Create an object of the `SmartHomeDevice` class.
    - Call the `turnOn()` method.
    - Call the `configure()` method.

## Example InputOutput:

**Expected Output:**

```plaintext
Turning on Smart Home Device
Configuring Smart Home Device settings
```

**Explanation:**
- The `SmartHomeDevice` class implements both the `Controllable` and `Configurable` interfaces, providing concrete implementations for both the `turnOn()` and `configure()` methods.

**Step 5: Run Your Application**

1. Execute your program to verify that the output matches the expected result.

## Tips:

- **Multiple Interfaces:** Java allows a class to implement multiple interfaces, meaning a class can inherit behavior from more than one interface.
- **Interface Implementation:** A class that implements multiple interfaces must provide an implementation for all the unimplemented methods from each interface.

By completing this exercise, you will understand how to implement multiple interfaces in Java and how to provide implementations for unimplemented methods in a class. Happy coding!
