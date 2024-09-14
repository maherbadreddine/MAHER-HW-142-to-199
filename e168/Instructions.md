# Exercise: Implementing Multiple Interfaces in a Bank Transaction System

## Objective
Learn how to implement multiple interfaces in Java to define behaviors for bank transactions like deposits, withdrawals, and balance inquiries. In this exercise, you will create a system where the interface structure represents these operations, and a class implements them while also displaying the results.

## Instructions

**Step 1: Create the `Transaction` Interface**

1. **Create the `Transaction.java` interface** with the following:
   - **Unimplemented Method:**
      - Declare an unimplemented method `processTransaction(double amount)`, representing the ability to process a financial transaction and return the result.

**Step 2: Create the `BankOperations` Interface**

1. **Create the `BankOperations.java` interface** that extends `Transaction`:
   - **Unimplemented Methods:**
      - Declare the following unimplemented methods for basic banking operations:
         - `double deposit(double amount);`
         - `double withdraw(double amount);`
         - `double checkBalance();`
   - **Inherit from Transaction:**
      - The `BankOperations` interface inherits the `processTransaction(double amount)` method from `Transaction`.

   - **Note:** The `deposit()` and `withdraw()` methods will use the `processTransaction()` to print out the result of each transaction.

**Step 3: Create a `BankAccount` Class that Implements the `BankOperations` Interface**

1. **Create a `BankAccount.java` class** that implements the `BankOperations` interface:
   - **Instance Variables:**
      - Create an instance variable `balance` to hold the current account balance.
   - **Constructor:**
      - Initialize the balance in the constructor.
   - **Implement Methods:**
      - Provide implementations for `deposit()`, `withdraw()`, and `checkBalance()`.
      - Use the `processTransaction(double amount)` method to print `"Transaction successful: DepositedWithdrew [amount]"`.
      - Ensure that `withdraw()` only processes the transaction if there are sufficient funds, otherwise print `"Transaction failed: Insufficient funds"`.

**Step 4: Test the Implementation in the `E167MultipleInterface` Class**

1. **In the `E167MultipleInterface.java` class**:
   - Create an object of the `BankAccount` class.
   - Call `deposit()`, `withdraw()`, and `checkBalance()` methods, processing transactions and printing the result via the `processTransaction()` method.

## Example InputOutput:

**Expected Output:**

```plaintext
Transaction successful: Deposited 100.0
Transaction successful: Withdrew 50.0
Current Balance: 50.0
Transaction failed: Insufficient funds
```

**Explanation:**
- The `BankAccount` class implements the `BankOperations` interface, which inherits from `Transaction`, meaning the class must implement both the banking operations and the transaction processing display method.

**Step 5: Run Your Application**

1. Execute your program to verify that the output matches the expected result.

## Tips:

- **Multiple Inheritance via Interfaces:** In Java, interfaces allow for multiple inheritance-like behavior. Here, `BankOperations` inherits from `Transaction`, and the `BankAccount` class implements both banking operations and transaction processing.
- **Real-World Example:** In a banking system, operations like deposits, withdrawals, and balance inquiries are essential, and processing transactions is a fundamental part of how the system works.

By completing this exercise, you will understand how to implement multiple interfaces in Java and how to provide implementations for unimplemented methods inherited from parent interfaces in a real-world context. Happy coding!
