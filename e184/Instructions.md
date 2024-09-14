# Exercise: Removing Countries that Start with 'A' from a List

## Objective
Learn how to manipulate a `List` in Java by removing elements that start with the letter 'A' from a given list of country names and returning the updated list.

## Instructions

**Step 1: Create a Method to Filter the List**

1. **Create the `E184CountryList.java` class** with the following:
    - **Method Definition:**
        - Create a method `removeCountriesStartingWithA` that takes a `List<String>` as a parameter.
        - Remove all elements from the list that start with the letter 'A'.
        - Return the updated list.

**Step 2: Add Country Names to the List**

1. **In the main method**, add the following country names to the `List<String>`:
    - "USA", "Argentina", "Kazakhstan", "Australia", "Pakistan", "Russia"

**Step 3: Call the Method and Print the Result**

1. **Call the `removeCountriesStartingWithA` method** and pass the list of country names as a parameter.
2. **Print the updated list**, which should no longer contain countries starting with 'A'.

## Example InputOutput:

**Output:**

```plaintext
[USA, Kazakhstan, Pakistan, Russia]
```

## Tips:

- **List Manipulation:** Use the `removeIf` method in Java to easily remove elements that match a specific condition (in this case, starting with the letter 'A').
- **Real-World Example:** Filtering data from a list is a common task in many applications, such as when processing user data, managing inventories, or filtering records in databases.

Happy coding!