# Exercise: Managing Customer Information with Encapsulation in an Online Store

## Objective
Learn how to use encapsulation in Java to securely handle customer information in an online store management system. You will practice using getter and setter methods to access and modify customer data securely.

## Instructions

**Step 1: Create the `Customer` Class**

1. **Create the `Customer.java` class** with the following:
    - **Private Variables:**
        - Declare two private variables to store customer information:
            - `private String customerName;`  to store the customer’s name
            - `private int customerAge;`  to store the customer’s age
    - **Getter and Setter Methods:**
        - Create a public `getCustomerName()` method to return the customer’s name.
        - Create a public `setCustomerName(String name)` method to set the customer’s name.
        - Create a public `getCustomerAge()` method to return the customer’s age.
        - Create a public `setCustomerAge(int age)` method to set the customer’s age.

**Step 2: Create the `StoreManagement` Class to Manage Customers**

1. **Create the `StoreManagement.java` class** that contains the main method:
    - **Main Method:**
        - Create an object of the `Customer` class.
        - Use the setter methods to set the customer’s name to `"Mario"` and age to `32`.
        - Use the getter methods to print the customer’s name and age as shown in the output below.

## Example InputOutput:

**Expected Output:**

```plaintext
Customer Name: Mario
Customer Age: 32
```

**Explanation:**
- The `Customer` class uses encapsulation to protect the customer’s private data, allowing access only through getter and setter methods.
- The `StoreManagement` class demonstrates how to set and retrieve customer information using the provided encapsulated methods.

**Step 3: Run Your Application**

1. Execute your program to verify that the output matches the expected result.

## Tips:

- **Encapsulation:** Encapsulation is the process of wrapping data (variables) and methods in a class and restricting access to them. This ensures that internal data is protected and can only be accessed through well-defined methods.
- **Real-World Example:** In an online store, customer details such as name and age are sensitive information that must be accessed securely, which is why encapsulation is a good practice.

By completing this exercise, you will gain a clear understanding of how encapsulation works in Java and how to secure sensitive data using getter and setter methods. Happy coding!
