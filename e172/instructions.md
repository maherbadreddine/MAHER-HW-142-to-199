# Exercise: Managing Customer Information Using Encapsulation

## Objective
Learn how to apply encapsulation in Java to manage customer information securely. You will practice using getter and setter methods to access and modify the customer’s personal and financial data.

## Instructions

**Step 1: Create the `Customer` Class**

1. **Create the `Customer.java` class** with the following:
    - **Private Variables:**
        - `private long accountNumber;`
        - `private String fullName;`
        - `private String email;`
        - `private double balance;`
    - **Constructor:**
        - Create a constructor to initialize all the variables when creating a customer.
    - **Getter and Setter Methods:**
        - Create getter and setter methods for each variable to access and modify the values.

**Step 2: Create the `E172Encapsulation` Class**

1. **Create the `E172Encapsulation.java` class** that contains the main method:
    - **Main Method:**
        - Create an object of the `Customer` class and assign values for:
            - `accountNumber = 1234567890`
            - `fullName = Sarah Connor`
            - `email = sarah.connor@example.com`
            - `balance = 15000.0`
        - Print the customer's account and personal details using getter methods.

## Example InputOutput:

**Expected Output:**

```plaintext
Account Number: 1234567890
Full Name: Sarah Connor
Email: sarah.connor@example.com
Account Balance: 15000.0
```

## Tips:

- **Encapsulation:** Use getter and setter methods to access the private variables. This protects the data from being accessed directly and allows controlled access.
- **Simplified Example:** This exercise demonstrates a real-world use case for managing customer details in a simple system.

Happy coding!