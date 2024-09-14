# Exercise: Implementing Encapsulation in an Employee Information Management System

## Objective
Learn how to use encapsulation in Java to secure the employee data in a Human Resources (HR) system. In this exercise, you will encapsulate employee information and use getter and setter methods to access and update the data.

## Instructions

**Step 1: Create the `Employee` Class**

1. **Create the `Employee.java` class** with the following:
    - **Private Variables:**
        - Declare two private variables to store employee information:
            - `private String empName;`  to store the employee’s name
            - `private int empAge;`  to store the employee’s age
    - **Getter and Setter Methods:**
        - Create a public `getEmpName()` method to return the employee’s name.
        - Create a public `setEmpName(String name)` method to set the employee’s name.
        - Create a public `getEmpAge()` method to return the employee’s age.
        - Create a public `setEmpAge(int age)` method to set the employee’s age.

**Step 2: Create the `E169Encapsulation` Class to Manage Employees**

1. **Create the `E169Encapsulation.java` class** that contains the main method:
    - **Main Method:**
        - Create an object of the `Employee` class.
        - Use the setter methods to set the employee’s name to `"John"` and age to `30`.
        - Use the getter methods to print the employee’s name and age as shown in the output.

## Example InputOutput:

**Expected Output:**

```plaintext
Employee Name: John
Employee Age: 30
```

**Explanation:**
- The `Employee` class uses encapsulation to protect the employee's private data, allowing access only through getter and setter methods.
- The `E169Encapsulation` class, which contains the main method, demonstrates how to set and retrieve employee information using the provided encapsulated methods.

**Step 3: Run Your Application**

1. Execute your program to verify that the output matches the expected result.

## Tips:

- **Encapsulation:** Encapsulation is the process of wrapping data (variables) and methods in a class and restricting access to them. This ensures that the internal data is protected and can only be accessed through well-defined methods.
- **Real-World Example:** In a Human Resources system, employee details like name and age are sensitive information that must be accessed securely, which is why encapsulation is a good practice.

By completing this exercise, you will gain a clear understanding of how encapsulation works in Java and how to secure sensitive data using getter and setter methods. Happy coding!
