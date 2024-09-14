# Exercise: Copying and Displaying Task Status from a To-Do List

## Objective
Learn how to use an `ArrayList` in Java to store task statuses represented as booleans (true = completed, false = not completed). You will copy these statuses into another list and use an iterator to display each status, simulating a real-world scenario where you track tasks and verify their status.

## Instructions

**Step 1: Create an ArrayList of Task Statuses**

1. **Create the `E181TaskStatus.java` class** with the following:
    - **ArrayList Initialization:**
        - Initialize an `ArrayList<Boolean>` called `listA` to store the status of tasks.
    - **Add Task Statuses:**
        - Add three boolean values to `listA` representing whether tasks are completed or not (`true`, `false`, `false`).
    - **Copy Task Statuses to Another List:**
        - Create another `ArrayList<Boolean>` called `listB` and copy all values from `listA` into `listB`.
    - **Use Iterator to Print Task Statuses:**
        - Use an `Iterator` to loop through `listB` and print the task statuses one by one.

## Example InputOutput:

**Output:**

```plaintext
true
false
false
```

## Tips:

- **ArrayList Operations:** Use `add()` to add task statuses to `listA` and `addAll()` to copy values to `listB`.
- **Using Iterators:** Use an `Iterator` to traverse `listB` and print each task status.
- **Real-World Example:** This exercise simulates tracking the status of tasks in a To-Do list, where tasks can be marked as complete (`true`) or incomplete (`false`), and the status is displayed for reporting purposes.

Happy coding