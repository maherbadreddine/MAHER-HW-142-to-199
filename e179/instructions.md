# Exercise: Filtering a LinkedList Based on Divisibility by 3

## Objective
Learn how to use a `LinkedList` in Java to store numbers, iterate through them using loops, and filter out numbers based on a condition. You will store integers from 50 to 100, remove all numbers that are not divisible by 3, and print the filtered list.

## Instructions

**Step 1: Create a LinkedList of Integers**

1. **Create the `E179LinkedListDivisibility.java` class** with the following:
    - **LinkedList Initialization:**
        - Initialize a `LinkedList<Integer>` to store integers from 50 to 100.
    - **Add Elements to LinkedList:**
        - Use a loop to add integers from 50 to 100 to the linked list.
    - **Remove Elements Not Divisible by 3:**
        - Use an iterator or a loop to remove all integers from the list that are not divisible by 3.
    - **Print the Remaining Elements:**
        - After filtering, print the remaining elements in the LinkedList, which should be numbers divisible by 3.

## Example InputOutput:

**Output:**

```plaintext
[51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]
```

## Tips:

- **LinkedList Operations:** Use `add()` to add elements to the linked list and `remove()` in combination with `Iterator` or `for` loop to filter out numbers.
- **Condition-Based Filtering:** Use the modulus operator (`%`) to check if a number is divisible by 3.
- **Real-World Example:** This exercise simulates filtering a list of numbers based on a specific condition (divisibility), which is often done in data processing tasks.

Happy coding!
