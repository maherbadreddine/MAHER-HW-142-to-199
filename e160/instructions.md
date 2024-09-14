# Exercise: Overloading Methods in BankAccount Operations

## Objective
Learn how to implement method overloading in Java by creating multiple versions of both static and private instance methods with different parameters. This exercise will help you understand how method overloading works with both instance and static methods and how to execute these methods from the main method.

## Instructions

**Step 1: Create the `BankAccount` Class**

1. **Create the `BankAccount.java` class** with the following:
    - **Private Instance Method 1: Display Account Info**
        - Create a private instance method named `displayInfo` with no parameters.
        - Implement logic to print `"private displayInfo method"`.

    - **Private Instance Method 2: Display Account Info with Balance**
        - Create an overloaded private instance method named `displayInfo` that accepts an `int` parameter representing the account balance.
        - Implement logic to print `"private displayInfo method with balance: " + balance`.

    - **Static Method 1: Display General Bank Info**
        - Create a static method named `displayBankInfo` with no parameters.
        - Implement logic to print `"static method without parameter"`.

    - **Static Method 2: Display General Bank Info with Number of Branches**
        - Create an overloaded static method named `displayBankInfo` that accepts an `int` parameter representing the number of bank branches.
        - Implement logic to print `"static method with int parameter: " + branches`.

   **Explanation:**
    - These methods demonstrate how method overloading can be applied to both private instance methods and static methods. This allows you to handle different operations and information display for a bank account.

**Step 2: Test the Methods in the `Main` Method**

1. **In the `BankAccount` class:**
    - **Main Method:**
        - In the `main` method, create an object of the `BankAccount` class.
        - Call the first `displayInfo` method (with no parameters) using the object.
        - Call the overloaded `displayInfo` method (with an `int` parameter) using the object.
        - Directly call the first `displayBankInfo` method (with no parameters) using the class name.
        - Call the overloaded `displayBankInfo` method (with an `int` parameter) using the class name.
        - Print the output to verify that all methods are being called correctly.

   **Expected Behavior:**
    - The output should show the results of each method call:
        - `"private displayInfo method"`
        - `"private displayInfo method with balance: 5000"`
        - `"static method without parameter"`
        - `"static method with int parameter: 20"`

   **Example Implementation:**
    - The output sequence should clearly reflect the correct calls to the overloaded private instance and static methods:
    - ```
      private displayInfo method
      private displayInfo method with balance: 5000
      static method without parameter
      static method with int parameter: 20
      ```

**Step 3: Run Your Application**

1. Execute your program to verify that the output matches the expected result.

## Tips:

- **Method Overloading:** Understand how method overloading allows you to define multiple versions of both instance and static methods with different parameters.
- **Accessing Private Methods:** Remember that private methods can only be accessed from within the class they are defined in, so the main method must be within the same class.
- **Calling Static Methods:** Static methods can be called directly using the class name without needing to create an instance of the class.

By completing this exercise, you will gain a clear understanding of method overloading in Java, focusing on how to overload both private instance and static methods and call them from within the same class. Happy coding!
