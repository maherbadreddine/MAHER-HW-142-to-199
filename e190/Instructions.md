# Exercise: Storing and Printing Address Details Using LinkedHashMap

## Objective
Learn how to use a `LinkedHashMap` in Java to store key-value pairs and preserve the order of entries. This exercise demonstrates how `LinkedHashMap` ensures the order in which the elements were inserted and how to retrieve and print the values.

## Instructions

**Step 1: Create a LinkedHashMap to Store Address Details**

1. **Create the `E190Map.java` class** with the following:
    - **LinkedHashMap Initialization:**
        - Initialize a `LinkedHashMap<String, String>` to store address details where keys represent the address components (e.g., "Street", "City"), and values represent the actual data (e.g., "Patrick ST", "Vienna").


**Step 2: Add Address Details to the LinkedHashMap**

1. **Add the following address components as key-value pairs to the LinkedHashMap**:
    - Add `"Street" = "Patrick ST"`, `"Suite" = "265"`, `"City" = "Vienna"`, `"Zip" = "22180"`, and `"Country" = "United States"`.
    - **Explanation:** A `LinkedHashMap` will store these entries in the order they are added, unlike a regular `HashMap` which does not guarantee the order of entries.

**Step 3: Print All Address Values from the LinkedHashMap**

1. **Use a for-each loop** to iterate through the values of the `LinkedHashMap` and print each value one by one.

## Example InputOutput:

**Output:**

```plaintext
Patrick ST
265
Vienna
22180
United States
```

## Why Use a LinkedHashMap for Address Storage?

- **Order Preservation:** When storing address details, the order in which information is displayed matters (e.g., street first, then suite, city, zip code, etc.). A `LinkedHashMap` ensures the data is printed in the order it was entered.
- **Efficient Retrieval:** You can quickly retrieve and print specific parts of the address using the map’s keys, making it useful in applications such as forms or databases.

Happy coding!