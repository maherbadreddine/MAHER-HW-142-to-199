# Exercise: Managing Employee Ages with LinkedList - Filtering, Sorting, and Averaging

## Objective
Learn how to use a `LinkedList` in Java to store employee ages, filter them based on conditions, sort the ages, and calculate the average age. You will store integers representing employee ages, filter out ages that do not meet a certain threshold, sort the remaining ages, and print the average.

## Instructions

**Step 1: Create a LinkedList of Employee Ages**

1. **Create the `E179EmployeeAges.java` class** with the following:
    - **LinkedList Initialization:**
        - Initialize a `LinkedList<Integer>` to store employee ages.
    - **Add Employee Ages:**
        - Use the `add()` method to manually add 10 employee ages to the LinkedList. Use ages between 20 and 65.
    - **Filter Ages:**
        - Remove any ages that are not between 25 and 60.
    - **Sort the Remaining Ages:**
        - Sort the filtered ages in ascending order using `Collections.sort()`.
    - **Calculate and Print the Average Age:**
        - Loop through the sorted LinkedList to calculate the average age of the remaining employees.
    - **Print the Remaining Ages and the Average:**
        - After filtering and sorting, print the remaining ages and the calculated average.

## Example InputOutput:

**Output:**

```plaintext
Remaining ages: [30, 35, 40, 45, 50, 55, 60]
Average age: 45.0
```

## Tips:

- **LinkedList Operations:** Use `add()` to manually add employee ages, and `removeIf()` or an iterator to filter out ages that do not meet the specified condition.
- **Sorting:** Use `Collections.sort()` to sort the ages in ascending order.
- **Average Calculation:** Use a loop or stream to calculate the average of the remaining ages.
- **Real-World Example:** This exercise simulates managing a list of employee ages in a company, where we filter out younger or older employees, sort the remaining ages, and calculate the average for reporting purposes.

Happy coding!
