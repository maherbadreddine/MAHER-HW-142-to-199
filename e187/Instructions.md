# Exercise: Managing a Unique Collection of Colors Using HashSet

## Objective
Learn how to use a `HashSet` in Java to store a collection of unique colors, where the order of insertion doesn’t matter. You will see how `HashSet` automatically prevents duplicates and does not preserve the order of elements.

## Instructions

**Step 1: Create a HashSet to Store Color Names**

1. **Create the `E187Set.java` class** with the following:
    - **HashSet Initialization:**
        - Initialize a `HashSet<String>` to store color names.

**Step 2: Add Color Names to the HashSet**

1. **Add the following color names to the HashSet**:
    - Add "Red", "Pink", "Yellow", "White", and "Black".
    - **Explanation:** Since the `HashSet` does not preserve insertion order and automatically removes duplicates, it's perfect for storing collections where the order of the elements is irrelevant.

**Step 3: Print the Color Collection**

1. **Print the color collection** in the `HashSet`. Note that the order of elements may differ, but all elements will be unique.

**Step 4: Print the Size of the HashSet**

1. **Use the `size()` method** to get and print the number of unique colors in the `HashSet`.


## Example InputOutput:

**Output:**

```plaintext
Original Hash Set: [Red, Pink, White, Yellow, Black]
Size of the Hash Set: 5
```

## Why Use a HashSet?

- **Uniqueness Guaranteed:** If duplicates are accidentally added, the `HashSet` will automatically handle them by only keeping one copy.
- **No Order Preservation:** In scenarios where you do not care about the order, a `HashSet` is perfect since it doesn’t guarantee any specific ordering of elements.
- **Efficient Operations:** Adding and checking elements in a `HashSet` is faster compared to lists.

Happy coding!