# Exercise: Implementing Overloaded Methods for Calculating Loan Payments

## Objective
Learn how to implement method overloading in Java by creating multiple methods with the same name but different parameters. This exercise will help you understand how to perform different operations based on the number of arguments passed to a method within the context of calculating loan payments.

## Instructions

**Step 1: Create the `LoanPaymentCalculator` Class**

1. **Create the `LoanPaymentCalculator.java` class** with the following:
    - **Method 1: Calculate Monthly Payment for a Simple Loan**
        - Create a method named `calculatePayment` that accepts two `double` parameters: the loan amount and the annual interest rate.
        - Implement logic to calculate the monthly payment assuming a fixed 12-month term. Use the formula: `payment = (loanAmount * (1 + interestRate  100))  12`.

    - **Method 2: Calculate Monthly Payment for a Loan with Custom Term**
        - Create an overloaded method named `calculatePayment` that accepts three `double` parameters: the loan amount, the annual interest rate, and the number of months for the loan term.
        - Implement logic to calculate the monthly payment using the formula: `payment = (loanAmount * (1 + interestRate  100))  numberOfMonths`.

    - **Method 3: Calculate Monthly Payment for a Loan with Custom Term and Down Payment**
        - Create another overloaded method named `calculatePayment` that accepts four `double` parameters: the loan amount, the annual interest rate, the number of months for the loan term, and the down payment.
        - Implement logic to calculate the monthly payment using the formula: `payment = ((loanAmount - downPayment) * (1 + interestRate  100))  numberOfMonths`.

   **Explanation:**
    - These overloaded methods demonstrate how the same method name `calculatePayment` can be used to calculate loan payments under different conditions and terms.

**Step 2: Test the Methods in the `E157SuperKeyword` Class**

1. **Use the existing `E157SuperKeyword.java` class** with the following:
    - **Object Creation:**
        - Create an object of the `LoanPaymentCalculator` class.
    - **Method Calls:**
        - Call the `calculatePayment` method with two arguments (e.g., `10000, 5`) and print the result.
        - Call the `calculatePayment` method with three arguments (e.g., `10000, 5, 24`) and print the result.
        - Call the `calculatePayment` method with four arguments (e.g., `10000, 5, 24, 2000`) and print the result.

   **Expected Behavior:**
    - The output should show the results of each loan payment calculation:
        - `"875.00"` (from calculating a simple loan payment over 12 months)
        - `"437.50"` (from calculating a loan payment over 24 months)
        - `"350.00"` (from calculating a loan payment with a down payment over 24 months)

   **Example Implementation:**
    - The output sequence should clearly reflect the results of the loan payment calculations:
    - ```
      875.00
      437.50
      350.00
      ```

**Step 3: Run Your Application**

1. Execute your program to verify that the output matches the expected result.

## Tips:

- **Method Overloading:** Understand how method overloading allows you to use the same method name with different parameters to perform different operations.
- **Realistic Calculations:** Make sure to follow the formula provided to calculate the correct monthly payments based on different loan conditions.

By completing this exercise, you will gain a clear understanding of method overloading in Java, observing how different methods can perform similar operations with varying numbers of inputs within a financial loan context. Happy coding!
