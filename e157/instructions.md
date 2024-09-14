# Exercise: Implementing Overloaded Methods for Financial Transactions

## Objective
Learn how to implement method overloading in Java by creating multiple methods with the same name but different parameters. This exercise will help you understand how to perform different operations based on the number of arguments passed to a method within the context of financial transactions.

## Instructions

**Step 1: Create the `TransactionCalculator` Class**

1. **Create the `TransactionCalculator.java` class** with the following:
    - **Method 1: Calculate Profit from 2 Transactions**
        - Create a method named `calculateProfit` that accepts two `int` parameters representing profits from two different transactions.
        - Implement logic to subtract the cost of the transactions from the total revenue and return the result.

    - **Method 2: Calculate Profit from 3 Transactions**
        - Create an overloaded method named `calculateProfit` that accepts three `int` parameters representing profits from three different transactions.
        - Implement logic to subtract the cost of the transactions from the total revenue and return the result.

    - **Method 3: Calculate Profit from 4 Transactions**
        - Create another overloaded method named `calculateProfit` that accepts four `int` parameters representing profits from four different transactions.
        - Implement logic to subtract the cost of the transactions from the total revenue and return the result.

   **Explanation:**
    - These overloaded methods demonstrate how the same method name `calculateProfit` can be used to calculate profit from a different number of transactions.

**Step 2: Test the Methods in the `E157MethodOverloading` Class**

1. **Use the existing `E157MethodOverloading.java` class** with the following:
    - **Object Creation:**
        - Create an object of the `TransactionCalculator` class.
    - **Method Calls:**
        - Call the `calculateProfit` method with four arguments (e.g., `100, 20, 30, 10`) and print the result.
        - Call the `calculateProfit` method with three arguments (e.g., `80, 30, 20`) and print the result.
        - Call the `calculateProfit` method with two arguments (e.g., `50, 30`) and print the result.

   **Expected Behavior:**
    - The output should show the results of each profit calculation:
        - `"40"` (from calculating profit from four transactions)
        - `"30"` (from calculating profit from three transactions)
        - `"20"` (from calculating profit from two transactions)

   **Example Implementation:**
    - The output sequence should clearly reflect the results of the profit calculations:
    - ```
      40
      30
      20
      ```

**Step 3: Run Your Application**

1. Execute your program to verify that the output matches the expected result.

## Tips:

- **Method Overloading:** Understand how method overloading allows you to use the same method name with different parameters to perform different operations.
- **Parameter Order:** Ensure that the order of operations is consistent with the number of parameters provided.

By completing this exercise, you will gain a clear understanding of method overloading in Java, observing how different methods can perform similar operations with varying numbers of inputs within a financial context. Happy coding!
