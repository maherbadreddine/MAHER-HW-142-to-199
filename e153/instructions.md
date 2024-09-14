# Exercise: Understanding Constructor Chaining in Java Inheritance

## Objective
Learn how to use constructors in Java, including how to explicitly call a parent class constructor from a subclass. This exercise will help you understand how constructor chaining works in inheritance, particularly when using default constructors.

## Instructions

**Step 1: Create the `Vehicle` Class with a No-Argument Constructor**

1. **Create the `Vehicle.java` class** with the following:
    - **No-Argument Constructor:**
        - Define a constructor with no parameters.
        - Inside this constructor, include logic to print `"This is the Vehicle constructor"` to indicate that this constructor has been called.

   **Example Implementation (Explanation):**
    - The no-argument constructor is used to initialize the `Vehicle` class without needing any external data. It serves as the default behavior when no specific data is provided during object creation.

**Step 2: Create the `Car` Class that Extends the `Vehicle` Class**

1. **Create the `Car.java` class** with the following:
    - **Inheritance:** Use the `extends` keyword to make the `Car` class a subclass of the `Vehicle` class.
    - **No-Argument Constructor:**
        - Define a constructor with no parameters in the `Car` class.
        - Inside this constructor, explicitly call the parent class (`Vehicle`) constructor using the `super()` keyword.

   **Example Implementation (Explanation):**
    - The `Car` class constructor should use `super()` to invoke the no-argument constructor of the `Vehicle` class.
    - This demonstrates how a subclass can explicitly call a specific constructor from its superclass to ensure that the parent class’s initialization logic is executed.

**Step 3: Test the Classes in the `E153SuperKeyword` Class**

1. **Use the existing `E153SuperKeyword.java` class** to test your `Car` and `Vehicle` classes:
    - **Object Creation:** Create an object of the `Car` class, which should trigger the constructor in the `Car` class.
    - **Expected Behavior:** When the `Car` object is created, it should automatically call the no-argument constructor of the `Vehicle` class, which prints a message.

   **Example Implementation (Explanation):**
    - When you create a `Car` object, the `Car` constructor is executed, and it calls the `Vehicle` constructor through `super()`.
    - The output should be the message from the `Vehicle` constructor.

   **Expected Output:**
    - The console should display the following output:
    - ```
      This is the Vehicle constructor
      ```

**Step 4: Run Your Application**

1. Execute your program to verify that the output matches the expected result.

## Tips:

- **Constructor Chaining:** Understand how constructors can be chained in inheritance. The `super()` keyword is used to call a constructor of the parent class from the child class.
- **No-Argument Constructor:** The no-argument constructor is a default constructor that doesn’t require any input parameters and provides default behavior or initialization.
- **Inheritance:** Inheritance allows a subclass to reuse code from a parent class, including constructors, ensuring that initialization logic is maintained across the class hierarchy.

By completing this exercise, you will gain experience in working with constructor chaining in the context of inheritance, particularly when using no-argument constructors. Happy coding!
