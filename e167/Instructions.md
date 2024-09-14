# Exercise: Implementing Multiple Inheritance Using Interfaces in a Home Automation System

## Objective
Learn how to implement multiple inheritance using interfaces in Java. You will create a system where one interface inherits from another, and a class will implement the child interface, inheriting methods from both interfaces.

## Instructions

**Step 1: Create the `BaseDeviceInterface` Interface**

1. **Create the `BaseDeviceInterface.java` interface** with the following:
   - **Unimplemented Method:**
      - Declare an unimplemented method `basicFunctionality()`, representing a basic function that every home automation device should have (like turning on or off).

**Step 2: Create the `AdvancedDeviceInterface` Interface**

1. **Create the `AdvancedDeviceInterface.java` interface** that extends the `BaseDeviceInterface`:
   - **Unimplemented Method:**
      - Declare an unimplemented method `advancedFunctionality()`, representing an advanced function for home automation devices (like adjusting settings or controlling multiple devices at once).
   - **Inherit from BaseDeviceInterface:**
      - The `AdvancedDeviceInterface` inherits the method `basicFunctionality()` from the `BaseDeviceInterface`.

**Step 3: Create a `SmartDevice` Class that Implements the `AdvancedDeviceInterface`**

1. **Create a `SmartDevice.java` class** that implements the `AdvancedDeviceInterface`:
   - **Implement Methods:**
      - Provide an implementation for the `basicFunctionality()` method that prints `"Basic Functionality: Device is turning on"`.
      - Provide an implementation for the `advancedFunctionality()` method that prints `"Advanced Functionality: Device is adjusting settings"`.

**Step 4: Test the Implementation in the `E167MultipleInterface` Class**

1. **In the `E167MultipleInterface.java` class**:
   - Create an object of the `SmartDevice` class.
   - Call both the `basicFunctionality()` and `advancedFunctionality()` methods.

## Example InputOutput:

**Expected Output:**

```plaintext
Basic Functionality: Device is turning on
Advanced Functionality: Device is adjusting settings
```

**Explanation:**
- The `SmartDevice` class implements the `AdvancedDeviceInterface`, which inherits from `BaseDeviceInterface`, meaning the class must implement both methods, `basicFunctionality()` and `advancedFunctionality()`.

**Step 5: Run Your Application**

1. Execute your program to verify that the output matches the expected result.

## Tips:

- **Multiple Inheritance via Interfaces:** In Java, interfaces allow for multiple inheritance-like behavior by having one interface extend another, and a class can implement all inherited methods.
- **Real-World Example:** In home automation systems, devices often have basic and advanced functionalities that can be controlled programmatically, making this a great example of multiple interface inheritance.

By completing this exercise, you will understand how to implement multiple inheritance using interfaces in Java and how to provide implementations for unimplemented methods inherited from parent interfaces. Happy coding!
