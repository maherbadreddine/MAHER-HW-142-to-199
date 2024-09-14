# Exercise: Understanding Constructors and Inheritance

## Objective
Learn how to use constructors in Java, including how to call parent class constructors from a subclass. This exercise will help you understand how constructors work in inheritance, particularly how a subclass can invoke constructors from its superclass, using a real-life example.

## Instructions

**Step 1: Create the `Building` Class with Constructors**

1. **Create the `Building.java` class** with the following:
    - **Instance Variables:**
        - `location`: Stores the location of the building. (String)
    - **Parameterized Constructor:**
        - Create a constructor that takes a `String` parameter called `location`.
        - Inside this constructor, print the value of the `location` parameter.
    - **Default Constructor:**
        - Create another constructor without any parameters.
        - Inside this constructor, print `"Building Constructor"` to indicate that this constructor has been called.

   **Example Implementation (Explanation):**
    - The parameterized constructor is used when you want to create an instance of the `Building` class with a specific location.
    - The default constructor is useful when you want to create an instance without specifying the location, which might be used in generic or default scenarios.

**Step 2: Create the `House` Class that Extends the `Building` Class**

1. **Create the `House.java` class** with the following:
    - **Inheritance:** Use the `extends` keyword to make the `House` class a subclass of the `Building` class.
    - **Constructor:**
        - Create a constructor in the `House` class that takes a `String` parameter.
        - Inside this constructor, use the `super` keyword to call the parameterized constructor of the `Building` class, passing the `String` argument to it.

   **Example Implementation (Explanation):**
    - The `House` class constructor should use `super(location)` to pass the location name to the parent class’s parameterized constructor.
    - This demonstrates how a subclass can call a specific constructor from its superclass to initialize inherited properties or execute specific logic relevant to the parent class.

**Step 3: Test the Classes in the `E152SuperKeyword` Class**

1. **Use the existing `E152SuperKeyword.java` class** to test your `House` and `Building` classes:
    - **Object Creation:** Create an object of the `House` class, passing the `String` value `"Vienna"` to its constructor.
    - **Expected Behavior:** When the `House` object is created, it should trigger the parameterized constructor of the `Building` class, which will print the location name.

   **Example Implementation (Explanation):**
    - The `House` class’s constructor is invoked when the object is created, and it passes `"Vienna"` to the `Building` class’s parameterized constructor.
    - The output should be the name of the location, which in this case is `"Vienna"`.

   **Expected Output:**
    - The console should display the following output:
    - ```
      Vienna
      ```

**Step 4: Run Your Application**

1. Execute your program to verify that the output matches the expected result.

## Tips:

- **Constructor Chaining:** Understand how constructors can be chained in inheritance. The `super` keyword is used to call a constructor of the parent class from the child class.
- **Default vs. Parameterized Constructors:** Recognize the difference between default and parameterized constructors, and when to use each.
- **Inheritance:** Inheritance allows a subclass to reuse code (like constructors) from a parent class, reducing redundancy.

By completing this exercise, you will gain experience in working with constructors, particularly in the context of inheritance, and learn how to manage constructor chaining effectively. Happy coding!
