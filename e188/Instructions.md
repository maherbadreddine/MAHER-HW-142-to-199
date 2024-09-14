# Exercise: Storing and Sorting Country Names Using TreeSet

## Objective
Learn how to use a `TreeSet` in Java to store and automatically sort string values in ascending order. You will see how `TreeSet` maintains the order of elements and removes any duplicates when added to the set.

## Instructions

**Step 1: Create a TreeSet to Store Country Names**

1. **Create the `E186Set.java` class** with the following:
    - **TreeSet Initialization:**
        - Initialize a `TreeSet<String>` to store country names, which will automatically sort the names in ascending order.

**Step 2: Add Country Names to the TreeSet**

1. **Add the following country names to the TreeSet**:
    - Add `"India"`, `"Australia"`, `"South Africa"`, `"India"`, `"America"`, and `"America"`.
    - **Explanation:** A `TreeSet` removes duplicates and sorts elements in natural ascending order (alphabetically in this case).

**Step 3: Print the TreeSet**

1. **Print the country names** in the `TreeSet`. Notice that the set is automatically sorted and duplicates are removed.

## Example InputOutput:

**Output:**

```plaintext
[America, Australia, India, South Africa]
```

## Why Use a TreeSet?

- **Automatic Sorting:** Unlike `HashSet`, a `TreeSet` automatically sorts elements in ascending order. It’s perfect when you need both uniqueness and ordering.
- **No Duplicates:** As with all sets, `TreeSet` ensures no duplicate values are stored.

Happy coding!