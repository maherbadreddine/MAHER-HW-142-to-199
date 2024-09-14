# Exercise: Managing Departments and Employees Using Map of Lists

## Objective
Learn how to use a **Map of Lists** in Java to manage groups of related items, such as employees in a department. In this exercise, each department will be a key in the map, and the list of employees in that department will be the associated value.

## Scenario
You are tasked with managing employees in different departments of a company. Your goal is to store the department names as keys and the list of employees as values in a `Map of Lists`. This way, all employees in a department can be easily accessed and managed together.



## Instructions

### Step 1: Initialize the Map and Lists

1. **Initialize a `Map<String, List<String>>` to store departments and employees.**
    - Create an empty map that will have the department names as keys and lists of employees as values.

2. **Create ArrayLists for Employees in Each Department**:
    - For each department, create an ArrayList to store the employee names.
    - **Hint**: You can use `ArrayList<String>` for storing employee names.

---

### Step 2: Add Employees to the Lists

1. **Add Employees to Each ArrayList**:
    - For example:
        - Add `Alice` and `Bob` to the HR department's list.
        - Add `Charlie`, `David`, and `Eve` to the IT department's list.

---

### Step 3: Add the Employee Lists to the Map

1. **Use the `put()` method to add each department and its corresponding employee list to the map**:
    - Associate the HR department with the list of HR employees.
    - Associate the IT department with the list of IT employees.

---

### Step 4: Print Each Department and Employees

1. **Use a `for-each` loop to access each entry (department and its employee list) from the map**:
    - First, get each department (key) and the corresponding employee list (value) using a loop.
    - Then, print the department name followed by its employees.

---

## Example Output:

```plaintext
Department: HR Employees: [Alice, Bob]
Department: IT Employees: [Charlie, David, Eve]
Department: Finance Employees: [Frank, Grace]

## Why Use Loops and Map Methods to Access Data?

**Key Points to Remember**:
- **Efficient Retrieval**: Loops provide a powerful way to efficiently retrieve and process data from a map. Whether you need to access just the keys (department names), the values (employee lists), or both (key-value pairs), loops allow you to do this quickly and cleanly.
- **Map Methods**:
    - **`keySet()`**: Retrieves all the keys (e.g., department names) in the map. This is useful when you only need to work with the names or titles of collections without accessing their contents.
    - **`values()`**: Retrieves all the values (e.g., employee lists) in the map. This is helpful when you need to process or manipulate the actual data inside the lists but don’t need the keys.
    - **`entrySet()`**: Retrieves both the keys and values as a set of `Map.Entry` objects. This method is great when you need to work with both the category (department) and the associated data (employees) at the same time.
- **Real-Life Application**: Managing a **student or employee database** is a common task in many organizations. Using maps and loops allows you to efficiently manage records, retrieve data, generate reports, and perform other operations in an organized way.

---