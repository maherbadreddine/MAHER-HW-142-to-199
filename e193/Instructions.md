# Exercise: Managing a Library Catalog Using Common Map Methods

## Objective
Learn how to use common methods in a `Map` in Java, such as `size()`, `isEmpty()`, `containsKey()`, `containsValue()`, `remove()`, and `clear()`. This exercise simulates a system where books in a library are stored in a catalog, and various operations like checking availability, removing a book, and clearing the catalog are performed.

## Instructions

**Step 1: Create a HashMap to Store the Library Catalog**

1. **Create the `E193Map.java` class** with the following:
    - **HashMap Initialization:**
        - Initialize a `HashMap<Integer, String>` where the key represents the unique book ID and the value represents the book title.


**Step 2: Add Books to the HashMap**

1. **Add the following books as key-value pairs to the HashMap**:
    - Add `101 = "The Catcher in the Rye"`, `102 = "To Kill a Mockingbird"`, `103 = "1984"`, `104 = "The Great Gatsby"`, `105 = "Moby Dick"`.
    - **Explanation:** A `HashMap` allows quick lookups and storage of books using their ID, which serves as the key, and the book title as the value.

**Step 3: Demonstrate Common Map Methods**

1. **Use the following methods** to manage and query the library catalog:

    - `size()`: Print the number of books currently in the catalog.
    - `isEmpty()`: Check if the catalog is empty and print the result.
    - `containsKey(102)`: Check if the book with ID `102` (To Kill a Mockingbird) is available in the catalog.
    - `containsValue("1984")`: Check if the book titled `"1984"` is available in the catalog.
    - `remove(105)`: Remove the book with ID `105` (Moby Dick) from the catalog and print the updated catalog.
    - `clear()`: Clear the entire catalog and check if it’s empty using `isEmpty()`.

## Example InputOutput:

**Output:**

```plaintext
Initial number of books in catalog: 5
Is the catalog empty? false
Is book with ID 102 available? true
Is the book "1984" available? true
Updated catalog after removing ID 105:
101: The Catcher in the Rye
102: To Kill a Mockingbird
103: 1984
104: The Great Gatsby
Is the catalog empty after clearing? true
​⬤