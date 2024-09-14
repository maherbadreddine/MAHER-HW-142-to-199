# Exercise: Managing a Student Database Using Loops to Retrieve Keys, Values, and Key-Value Pairs

## Objective
Learn how to retrieve keys, values, and both keys and values from a `Map` in Java using loops and specific `Map` methods. This exercise simulates a student database where student IDs are associated with their names, and we need to loop through the map to perform various retrieval tasks.

## Instructions

**Step 1: Create a HashMap to Store the Student Database**

1. **Create the `E194Map.java` class** with the following:
    - **HashMap Initialization:**
        - Initialize a `HashMap<Integer, String>` where the key represents the student ID, and the value represents the student name.


**Step 2: Add Student Records to the HashMap**

1. **Add the following student records to the HashMap**:
    - Add `101 = "John"`, `102 = "Emily"`, `103 = "Michael"`, `104 = "Sarah"`, `105 = "David"`.
    - **Explanation:** Each entry represents a student, where the student ID is the key, and the student's name is the value.

**Step 3: Retrieve and Print Keys (Student IDs) Using a Loop and `keySet()`**

1. **Use the `keySet()` method** to retrieve all the keys (student IDs) from the HashMap.
    - Use a loop to iterate through the keys of the HashMap and print each student ID in the format:  
      `"Student ID: [key]"`.


**Step 4: Retrieve and Print Values (Student Names) Using a Loop and `values()`**

1. **Use the `values()` method** to retrieve all the values (student names) from the HashMap.
    - Use a loop to iterate through the values of the HashMap and print each student name in the format:  
      `"Student Name: [value]"`.


**Step 5: Retrieve and Print Both Keys and Values Using a Loop and `entrySet()`**

1. **Use the `entrySet()` method** to retrieve both keys and values as `Map.Entry` objects from the HashMap.
    - Use a loop to iterate through both keys and values of the HashMap and print each student ID and name in the format:  
      `"Student ID: [key], Student Name: [value]"`.

## Example InputOutput:

**Output:**

```plaintext
Student IDs:
Student ID: 101
Student ID: 102
Student ID: 103
Student ID: 104
Student ID: 105

Student Names:
Student Name: John
Student Name: Emily
Student Name: Michael
Student Name: Sarah
Student Name: David

Student Records:
Student ID: 101, Student Name: John
Student ID: 102, Student Name: Emily
Student ID: 103, Student Name: Michael
Student ID: 104, Student Name: Sarah
Student ID: 105, Student Name: David
```

## Why Use Loops and Map Methods to Access Data?

- **Efficient Retrieval:** Loops allow efficient access to specific data (keys or values) or both (key-value pairs), which is crucial when working with large collections.
- **Map Methods:**
    - `keySet()`: Retrieves all keys in the map.
    - `values()`: Retrieves all values in the map.
    - `entrySet()`: Retrieves both keys and values as a set of `Map.Entry` objects.
- **Real-Life Application:** Managing a student database where you frequently need to access student IDs, names, or both is a common task in educational systems.

Happy coding!