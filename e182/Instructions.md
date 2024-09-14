# Exercise: Identifying and Storing Prime Numbers in a LinkedList

## Objective
Learn how to identify prime numbers, add them to a `LinkedList`, and print the list of prime numbers. You will create a method to check if a number is prime, add all prime numbers between 1 and 100 to the LinkedList, and print the final list of prime numbers.

## Instructions

**Step 1: Create a LinkedList to Store Prime Numbers**

1. **Create the `E182PrimeNumbersLinkedList.java` class** with the following:
    - **LinkedList Initialization:**
        - Initialize a `LinkedList<Integer>` to store prime numbers.

**Step 2: Create a Method to Check Prime Numbers**

1. **Create the method `isPrime(int num)`**:
    - This method will check if the input number is prime.
    - A prime number is only divisible by 1 and itself.
    - Return `true` if the number is prime, otherwise return `false`.

**Step 3: Add All Prime Numbers to the LinkedList**

1. **Use a loop to check each number from 1 to 100**:
    - For each number, use the `isPrime()` method to check if the number is prime.
    - If the number is prime, add it to the LinkedList.

**Step 4: Print the LinkedList of Prime Numbers**

1. **Print the final LinkedList**, which should contain all prime numbers between 1 and 100.

## Example InputOutput:

**Output:**

```plaintext
[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
```

## Tips:

- **Prime Number Definition:** A prime number is a number greater than 1 that has no positive divisors other than 1 and itself.
- **Efficiency Consideration:** You only need to check divisibility up to the square root of the number.
- **Real-World Example:** This task simulates the identification of prime numbers, which is essential in cryptography, computer security, and various algorithms.

Happy coding!