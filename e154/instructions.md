# Exercise: Constructor Overloading and Chaining

## Objective
Learn how to effectively use constructor overloading and chaining in Java by working with real-life examples. This exercise will help you understand how constructors interact in an inheritance hierarchy, particularly when managing different initialization scenarios.

## Instructions

**Step 1: Create the `Appliance` Class with Constructors**

1. **Create the `Appliance.java` class** with the following:
    - **No-Argument Constructor:**
        - Define a constructor with no parameters.
        - Inside this constructor, add logic to print `"Appliance Constructor without argument"` to indicate that this constructor has been called.
    - **Parameterized Constructor:**
        - Define another constructor that takes an `int` parameter called `wattage`.
        - Inside this constructor, add logic to print `"Wattage: " + wattage`.

   **Example Explanation:**
    - The no-argument constructor is useful for default initialization of `Appliance`, representing a general appliance with no specific details.
    - The parameterized constructor allows you to initialize `Appliance` with specific data (like wattage), demonstrating how different constructors can be used for various initialization scenarios.

**Step 2: Create the `WashingMachine` Class that Extends `Appliance`**

1. **Create the `WashingMachine.java` class** with the following:
    - **Inheritance:** Use the `extends` keyword to make the `WashingMachine` class a subclass of `Appliance`.
    - **No-Argument Constructor:**
        - Define a constructor with no parameters.
        - Inside this constructor, add logic to print `"WashingMachine Constructor without argument"`.
    - **Overloaded Constructor:**
        - Overload the constructor by defining another constructor that takes an `int` parameter representing the washing machine’s `capacity`.
        - Inside this constructor, use the `super(wattage)` keyword to call the parameterized constructor of the `Appliance` class, passing the `wattage` value to it.
        - After calling the parent constructor, add logic to print `"Capacity: " + capacity` to indicate the washing machine’s capacity.

   **Example Explanation:**
    - The `WashingMachine` class constructor without parameters demonstrates default behavior specific to a generic washing machine.
    - The overloaded constructor in `WashingMachine` calls the parent’s parameterized constructor using `super(wattage)`, showing how to initialize the wattage inherited from the `Appliance` class, followed by specific initialization of the washing machine’s capacity.

**Step 3: Test the Classes in the `E154SuperKeyword` Class**

1. **Use the existing `E154SuperKeyword.java` class** to test your `WashingMachine` and `Appliance` classes:
    - **Object Creation:**
        - Create an object of the `WashingMachine` class without passing any arguments.
        - Create another object of the `WashingMachine` class, passing the values `500` for `wattage` and `7` for `capacity`.
    - **Expected Behavior:**
        - When the first `WashingMachine` object is created, it should invoke the no-argument constructor of `Appliance` followed by the no-argument constructor of `WashingMachine`.
        - When the second `WashingMachine` object is created with the values `500` and `7`, it should invoke the parameterized constructor of `Appliance` through `super(wattage)`, followed by printing the washing machine’s capacity.

   **Example Implementation:**
    - The first object creation should trigger a sequence of constructor calls leading to the output:
        - `"Appliance Constructor without argument"`
        - `"WashingMachine Constructor without argument"`
    - The second object creation should result in the output:
        - `"Wattage: 500"`
        - `"Capacity: 7"`

   **Expected Output:**
    - The console should display the following output:
    - ```
      Appliance Constructor without argument
      WashingMachine Constructor without argument
      Wattage: 500
      Capacity: 7
      ```

**Step 4: Run Your Application**

1. Execute your program to verify that the output matches the expected result.

## Tips:

- **Constructor Overloading:** Understand how overloading constructors with different parameter sets allows for flexible object initialization in real-world scenarios.
- **Constructor Chaining:** Use the `super()` keyword to call a parent class constructor, ensuring that the base class is properly initialized before extending functionality in the subclass.
- **Inheritance:** Recognize how subclasses inherit constructors from their parent classes and how they can extend or modify initialization logic to suit specific needs.

By completing this exercise, you will gain hands-on experience with constructor overloading and chaining in the context of inheritance, enhancing your ability to manage complex initialization scenarios in real-life applications. Happy coding!
