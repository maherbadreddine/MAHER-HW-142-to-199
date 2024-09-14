# Exercise: Managing a Grocery Shopping List Using ArrayList and Loops

## Objective
Learn how to use an ArrayList in Java to manage a grocery shopping list. You will store items input by the user, remove duplicates from the list, and print the final list of unique items using loops.

## Instructions

**Step 1: Create an ArrayList for Grocery Items**

1. **Create the `E178GroceryList.java` class** with the following:
    - **ArrayList Initialization:**
        - Initialize an `ArrayList<String>` to store grocery items entered by the user.
    - **Input Grocery Items:**
        - Use the `Scanner` class to input 5 grocery items from the user.
    - **Remove Duplicates:**
        - Loop through the list and remove any duplicate items.
    - **Print Unique Items:**
        - Use a loop to print the unique grocery items in a single line.

**Step 2: Print the Results**

1. **Main Method:**
    - Input items from the user, remove duplicates, and print the unique grocery items in one line.

## Example InputOutput:

**Input:**

```plaintext
milk
bread
eggs
milk
cheese
```

**Output:**

```plaintext
milk bread eggs cheese
```

## Tips:

- **ArrayList Operations:** Use the `contains()` method to check for duplicates before adding items to the list.
- **Looping:** Use a `for` loop to iterate through the ArrayList and print each unique item.
- **Real-World Example:** This exercise simulates managing a grocery shopping list where duplicate items are removed, and the final list is displayed.

Happy coding!
