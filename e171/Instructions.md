# Exercise: Using Encapsulation to Securely Retrieve Employee Data in a Human Resource Management System

## Objective
Learn how to apply encapsulation in Java to securely retrieve employee data. In this exercise, you will use getter methods to access employee details without directly exposing the internal variables.

## Instructions

**Step 1: Create the `Employee` Class with Encapsulation**

1. **Create the `Employee.java` class** with the following:
    - **Private Variables:**
        - Declare two private instance variables to store employee details:
            - `private String empName = "John";`  to store the employee’s name
            - `private int empAge = 30;`  to store the employee’s age
    - **Getter Methods:**
        - Create a public method `getEmpName()` to return the employee’s name.
        - Create a public method `getEmpAge()` to return the employee’s age.

**Step 2: Create the `E171Encapsulation` Class to Retrieve and Display Employee Data**

1. **Create the `E171Encapsulation.java` class** that contains the main method:
    - **Main Method:**
        - Create an object of the `Employee` class.
        - Use the getter methods to retrieve the employee’s name and age.
        - Print the values of `empName` and `empAge` as shown in the expected output below.

## Example InputOutput:

**Expected Output:**

```plaintext
Employee Name: John
Employee Age: 30
```

**Explanation:**
- The `Employee` class uses encapsulation to protect employee data \(name and age\), allowing access only through getter methods.
- The `E171Encapsulation` class demonstrates how to retrieve this data securely by calling the getter methods and printing the employee details.

**Step 3: Run Your Application**

1. Execute your program to verify that the output matches the expected result.

## Tips:

- **Encapsulation:** Encapsulation is the process of keeping data \(variables\) private and providing controlled access to them through public methods, known as getters and setters. In this exercise, you are practicing encapsulation by retrieving employee data via getter methods.
- **Real-World Example:** In a Human Resources system, sensitive employee details like name and age must be retrieved securely without exposing the underlying data structure directly.

**By completing this exercise, you will understand how encapsulation works in Java and how to apply it for securely retrieving data in a real-world context. Happy coding!**