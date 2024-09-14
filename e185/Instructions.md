# Exercise: Tracking Unique Customer Orders Using HashSet

## Objective
Learn how to use a `HashSet` to manage unique customer orders in a retail system. This exercise simulates a situation where you need to track customer IDs for orders and prevent duplicate entries. You will learn the benefits of using a `HashSet` over an `ArrayList` for scenarios where duplicate values must be avoided.

## Instructions

**Step 1: Create a HashSet to Store Unique Customer IDs**

1. **Create the `E185CustomerOrdersHashSet.java` class** with the following:
    - **HashSet Initialization:**
        - Initialize a `HashSet<Integer>` to store customer IDs for a retail order system.

**Step 2: Add Customer IDs to the HashSet**

1. **Imagine you receive the following customer orders (some with duplicate IDs)**:
    - Customers with the following IDs have placed orders: `1001`, `1002`, `1001`, `1003`, `1002`, `1004`.
    - Add these customer IDs to the `HashSet`.

**Explanation:** If you were to use an `ArrayList`, all customer IDs would be added, including duplicates, which could lead to incorrect data analysis (such as counting total unique customers). With a `HashSet`, duplicate IDs are automatically removed, ensuring that each customer is counted only once.

**Step 3: Print Each Unique Customer ID**

1. **Use a loop to print each unique customer ID**:
    - Iterate through the `HashSet` using a `for-each` loop and print each unique ID.

## Example InputOutput:

**Output:**

```plaintext
1001
1002
1003
1004
```

## Why Use a HashSet?

- **Duplicate Removal:** Using an `ArrayList` would include duplicate customer IDs, which can lead to incorrect analysis or data processing. In contrast, a `HashSet` automatically ensures that only unique values are stored, making it the better choice when uniqueness is required.
- **Real-World Example:** This situation is common in e-commerce, customer management systems, or any system where you need to ensure that each customer, product, or ID is only counted once.

Happy coding!