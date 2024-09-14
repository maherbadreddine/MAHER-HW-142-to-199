# Exercise: Overloading Private Methods in a Security System

## Objective
Learn how to use method overloading in Java. In this exercise, you will simulate a security system that uses private overloaded methods for different types of user authentication (password-based, OTP-based).

## Instructions

**Step 1: Create the `SecuritySystem` Class**

1. **Create the `SecuritySystem.java` class** with the following:
    - **Private Methods:**
        - Declare two overloaded private methods `authenticate()`.
            - One method `authenticate()` with no parameters simulates password-based authentication and prints `"Authenticating with password"`.
            - Another method `authenticate(int otp)` simulates OTP (One-Time Password)-based authentication and prints `"Authenticating with OTP: "` followed by the OTP value.

    - **Public Method to Call Private Methods:**
        - Create a public method `performAuthentication()` that will:
            - Call the private `authenticate()` method (password-based authentication).
            - Call the private `authenticate(int otp)` method (OTP-based authentication) with an example OTP value (e.g., 123456).

**Step 2: Test the Implementation in the `Main` Class**

1. **Create the `Main.java` class** that contains the main method:
    - **Main Method:**
        - Create an object of the `SecuritySystem` class.
        - Call the `performAuthentication()` method to execute both types of authentication.

## Example InputOutput:

**Expected Output:**

```plaintext
Authenticating with password
Authenticating with OTP: 123456
```

**Explanation:**
- The `SecuritySystem` class uses private methods to simulate different types of authentication (password-based and OTP-based) using method overloading.
- The `Main` class demonstrates how the `performAuthentication()` method calls both overloaded private methods to handle the authentication process.

**Step 3: Run Your Application**

1. Execute your program to verify that the output matches the expected result.

## Tips:

- **Method Overloading:** Method overloading allows you to have multiple methods with the same name but different parameter lists. Here, it is used to implement different authentication mechanisms (password-based and OTP-based).
- **Private Methods:** Private methods can only be called from within the same class. This exercise demonstrates how to use a public method to call overloaded private methods.

**By completing this exercise, you will understand how method overloading works in Java and how private methods can be used to handle different internal processes like authentication. Happy coding!**
