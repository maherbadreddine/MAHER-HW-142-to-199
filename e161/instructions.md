# Exercise: Overriding Methods in an Employee Management System

## Objective
Learn how to override methods in Java and understand the impact of access modifiers on method visibility in subclasses. This exercise will help you understand how to implement method overriding across a parent and multiple child classes, and how access modifiers influence which methods can be overridden and accessed.

## Instructions

**Step 1: Create the `Employee` Parent Class**

1. **Create the `Employee.java` class** with the following:
    - **Method 1: Public Method**
        - Create a public method named `work` that prints `"I am an Employee working"`.
    - **Method 2: Protected Method**
        - Create a protected method named `takeBreak` that prints `"I am an Employee taking a break"`.
    - **Method 3: Default (Package-Private) Method**
        - Create a default (package-private) method named `attendMeeting` that prints `"I am an Employee attending a meeting"`.
    - **Method 4: Private Method**
        - Create a private method named `submitReport` that prints `"I am an Employee submitting a report"`.
    - **Method 5: `hello()` Method**
        - Create a public method named `hello()` that prints `"method in Employee class"`.

   **Explanation:**
    - These methods demonstrate different access levels and a basic method that will be overridden in subclasses. The `submitReport` method is private and cannot be overridden.

**Step 2: Create the `Manager`, `Developer`, and `Intern` Subclasses**

1. **Create the `Manager.java`, `Developer.java`, and `Intern.java` classes** as subclasses of `Employee`:
    - **Override the `work` Method:**
        - In each subclass, override the `work` method to print:
            - For `Manager`: `"I am a Manager working"`
            - For `Developer`: `"I am a Developer working"`
            - For `Intern`: `"I am an Intern working"`
    - **Override the `takeBreak`, `attendMeeting`, and `hello` Methods:**
        - Override these methods similarly in each subclass with appropriate messages:
            - For `Manager`: `"I am a Manager taking a break"`, `"I am a Manager attending a meeting"`, `"method in Manager class"`
            - For `Developer`: `"I am a Developer taking a break"`, `"I am a Developer attending a meeting"`, `"method in Developer class"`
            - For `Intern`: `"I am an Intern taking a break"`, `"I am an Intern attending a meeting"`, `"method in Intern class"`

   **Explanation:**
    - These overrides show how each subclass can provide its specific implementation of the parent class methods, demonstrating polymorphism and access control.

**Step 3: Test the Methods in the `E161MethodOverriding` Class**

1. **In the `E161MethodOverriding.java` class:**
    - **Main Method:**
        - Create objects of `Manager`, `Developer`, and `Intern` classes.
        - Store these objects in an array of `Employee` type.
        - Loop through the array and call the `hello()` method for each object to demonstrate method overriding.
        - Additionally, create an object of the `Developer` class and call the `work`, `takeBreak`, and `attendMeeting` methods to see which overridden methods are accessible.

   **Expected Behavior:**
    - The output should show the results of each method call:
        - `"method in Manager class"`
        - `"method in Developer class"`
        - `"method in Intern class"`
        - `"I am a Developer working"`
        - `"I am a Developer taking a break"`
        - `"I am a Developer attending a meeting"`

   **Example Implementation:**
    - The output sequence should clearly reflect the correct method overriding and access:
    - ```
      method in Manager class
      method in Developer class
      method in Intern class
      I am a Developer working
      I am a Developer taking a break
      I am a Developer attending a meeting
      ```

**Step 4: Run Your Application**

1. Execute your program to verify that the output matches the expected result.

## Tips:

- **Method Overriding:** Understand how method overriding allows subclasses to provide specific implementations of parent class methods.
- **Access Modifiers:** Remember that access modifiers control the visibility of methods and determine whether they can be overridden or accessed in child classes.

By completing this exercise, you will gain a clear understanding of method overriding in Java, focusing on how to override methods with different access levels and implement polymorphism in an employee management system. Happy coding!
