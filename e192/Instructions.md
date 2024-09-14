# Exercise: Storing and Retrieving Items in Ascending Order Using TreeMap

## Objective
Learn how to use a `TreeMap` in Java to store key-value pairs where the keys are automatically sorted in ascending order. This exercise simulates an inventory system where each product is assigned a unique ID, and the products are retrieved in ascending order of their IDs.

## Instructions

**Step 1: Create a TreeMap to Store Product Details**

1. **Create the `E192Map.java` class** with the following:
    - **TreeMap Initialization:**
        - Initialize a `TreeMap<String, String>` to store product IDs as keys and their corresponding product names as values.

**Step 2: Add Product Details to the TreeMap**

1. **Add the following product details as key-value pairs to the TreeMap**:
    - Add `"1 item" = "apple"`, `"2 item" = "banana"`, `"3 item" = "pear"`, `"4 item" = "tomato"`, `"5 item" = "mango"`, `"6 item" = "kiwi"`.
    - **Explanation:** A `TreeMap` stores the keys in natural ascending order, meaning the products will be listed according to their ID numbers.

**Step 3: Extract and Print All Keys and Their Values from the TreeMap**

1. **Use a for-each loop** to iterate through the entries of the `TreeMap` and print each key-value pair in the format:  
   `Key is [key] and value is [value]`.

## Example InputOutput:

**Output:**

```plaintext
Key is 1 item and value is apple
Key is 2 item and value is banana
Key is 3 item and value is pear
Key is 4 item and value is tomato
Key is 5 item and value is mango
Key is 6 item and value is kiwi
```

## Why Use a TreeMap for Product Inventory?

- **Automatic Sorting:** A `TreeMap` ensures that the keys (product IDs) are automatically stored in ascending order, making it useful for inventory management systems where products are displayed based on their ID.
- **Efficient Retrieval:** You can efficiently retrieve and display products in the correct order by iterating over the map.

Happy coding!