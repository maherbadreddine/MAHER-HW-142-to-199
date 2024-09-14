# Exercise: Storing Objects of a Specific Class Inside a Map

## Objective
Learn how to store objects of a custom class inside a `Map` in Java. In this exercise, we will create a `Dog` class and store `Dog` objects inside a `Map`, where each dog has a unique ID as the key and the `Dog` object as the value.

## Scenario
You are tasked with creating a program to manage a collection of dogs. Each dog has attributes such as `name`, `breed`, and `age`. You will use a `Map` to store each `Dog` object with a unique ID as the key and the `Dog` object as the value. This allows efficient access to dog information based on the unique ID.

## Instructions

### Step 1: Create the Dog Class

1. **Define a `Dog` class** with the following attributes:
    - `String name`: The name of the dog.
    - `String breed`: The breed of the dog.
    - `int age`: The age of the dog.

2. **Create a constructor** for the `Dog` class to initialize the attributes.

3. **Override the `toString()` method**:
    - The `toString()` method is defined in the `Object` class, which is the parent of all classes in Java. By default, it returns a string representation of the object's memory address, which is not very useful for displaying meaningful information.
    - **Why override it?**
        - When you override `toString()`, you can provide a human-readable representation of the object. In this case, you want to display the dog's name, breed, and age in a clear format.
        - For example, instead of the default string like `Dog@123abc`, you can get something like `Dog{name='Max', breed='Labrador', age=5}`.
    - **How to override it?**: In the `Dog` class, override `toString()` to return a string containing the dog's details in a readable format. This is especially useful when printing objects directly.

---

### Step 2: Initialize the Map and Store Dog Objects

1. **Initialize a `Map<Integer, Dog>`** to store dogs with their IDs.
    - The `Integer` key will represent the unique ID of the dog, and the `Dog` object will be the value.

2. **Create Dog objects** and add them to the map:
    - For example, create three `Dog` objects:
        - A Labrador named Max, aged 5.
        - A Beagle named Bella, aged 3.
        - A Bulldog named Rocky, aged 4.

3. **Add each dog to the map** using a unique ID (e.g., `1`, `2`, `3`).

---

### Step 3: Retrieve and Print Dog Information

1. **Use a `for-each` loop to iterate over the map's entry set**:
    - Retrieve each dog's details by iterating over the `Map.Entry` objects.
    - Print each dog's ID and its corresponding details.

---

## Example Output:
```
Dog ID: 1, Details: Dog{name='Max', breed='Labrador', age=5}
Dog ID: 2, Details: Dog{name='Bella', breed='Beagle', age=3}
Dog ID: 3, Details: Dog{name='Rocky', breed='Bulldog', age=4}
```


---

## Why Use Maps for Storing Objects?

**Key Points to Remember**:

- **Efficient Retrieval**: A `Map` allows you to store and retrieve objects using unique keys. This makes it easy to access specific objects (like a dog) by their unique ID.
- **Map Methods**:
    - **`put()`**: Adds a key-value pair (e.g., `Dog ID` and `Dog object`) to the map.
    - **`get()`**: Retrieves the value (e.g., a `Dog` object) associated with a specific key.
    - **`entrySet()`**: Retrieves both the keys and values as a set of `Map.Entry` objects. This method is useful when you need to work with both the ID and the `Dog` object.

---

