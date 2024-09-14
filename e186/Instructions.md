# Exercise: Managing Unique Task Names Using HashSet

## Objective
Learn how to use a `HashSet` in Java to store and manage unique task names for a project. This exercise simulates a situation where you want to track tasks without allowing duplicates, and shows how `HashSet` handles these operations.

## Instructions

**Step 1: Create a HashSet to Store Task Names**

1. **Create the `E186Set.java` class** with the following:
   - **HashSet Initialization:**
      - Initialize a `HashSet<String>` to store task names for a project.

**Step 2: Add Task Names to the HashSet**

1. **Add the following task names to the HashSet**:
   - Add tasks: "third", "first", and "second".
   - **Explanation:** A `HashSet` automatically prevents duplicate tasks and does not maintain insertion order. This is useful when tracking tasks, where duplicates are not allowed and order is irrelevant.

**Step 3: Print the HashSet**

1. **Print the task names** in the `HashSet`. The order may differ, but the tasks will be unique.

**Step 4: Remove All Tasks and Print the Result**

1. **Remove all tasks from the HashSet** using the `clear()` method.
2. **Print the HashSet again**, which should now be empty.

## Example InputOutput:

**Output:**

```plaintext
[first, second, third]
[]
```

## Why Use a HashSet?

- **Task Management:** A `HashSet` automatically handles duplicate tasks, which can be important in project tracking where each task needs to be unique.
- **Efficiency:** A `HashSet` provides faster operations for adding and removing tasks compared to lists, making it a better choice when order isn’t important, but uniqueness is essential.

Happy coding!