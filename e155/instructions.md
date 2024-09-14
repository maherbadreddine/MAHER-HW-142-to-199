# Exercise: Constructor Chaining in a Hierarchy

## Objective
Learn how to implement and observe constructor chaining in Java using a real-life inheritance hierarchy. This exercise will help you understand how constructors in parent and child classes are invoked in sequence when creating an object of a subclass.

## Instructions

**Step 1: Create the `Company` Class with a Default Constructor**

1. **Create the `Company.java` class** with the following:
    - **Default Constructor:**
        - Define a no-argument constructor.
        - Inside this constructor, add logic to print `"Company Established"` to the console.

   **Explanation:**
    - The `Company` class serves as the base class in the hierarchy. The default constructor will print `"Company Established"` when an object of this class or any subclass is created.

**Step 2: Create the `Department` Class that Extends `Company`**

1. **Create the `Department.java` class** with the following:
    - **Inheritance:** Use the `extends` keyword to make `Department` a subclass of `Company`.
    - **Default Constructor:**
        - Define a no-argument constructor.
        - Inside this constructor, add logic to print `"Department Created"` to the console.

   **Explanation:**
    - The `Department` class represents a specific department within a company. When an object of class `Department` (or any subclass of `Department`) is created, the constructor in `Company` will be called first, followed by the constructor in `Department`.

**Step 3: Create the `Employee` Class that Extends `Department`**

1. **Create the `Employee.java` class** with the following:
    - **Inheritance:** Use the `extends` keyword to make `Employee` a subclass of `Department`.
    - **Default Constructor:**
        - Define a no-argument constructor.
        - Inside this constructor, add logic to print `"Employee Hired"` to the console.

   **Explanation:**
    - The `Employee` class represents an individual employee within a department. When an object of class `Employee` is created, the constructors in `Company` and `Department` will be called first (in that order), followed by the constructor in `Employee`, demonstrating constructor chaining.

**Step 4: Test the Classes in the `E155SuperKeyword` Class**

1. **Use the existing `E155SuperKeyword.java` class** to test your `Employee`, `Department`, and `Company` classes:
    - **Object Creation:**
        - Create an object of the `Employee` class.
    - **Expected Behavior:**
        - When the `Employee` object is created, the constructors in `Company`, `Department`, and `Employee` should be called in order, resulting in the following output:
        - `"Company Established"` (from `Company`'s constructor)
        - `"Department Created"` (from `Department`'s constructor)
        - `"Employee Hired"` (from `Employee`'s constructor)

   **Example Implementation:**
    - The output sequence should clearly reflect the order of constructor calls:
    - ```
      Company Established
      Department Created
      Employee Hired
      ```

**Step 5: Run Your Application**

1. Execute your program to verify that the output matches the expected result.

## Tips:

- **Constructor Chaining:** Understand how constructors in a parent class are automatically called when a subclass object is created. The constructors are invoked from the top of the hierarchy down to the specific subclass.
- **Inheritance:** Recognize how subclass constructors rely on their parent class constructors for initialization, ensuring that all parts of the object are properly set up.

By completing this exercise, you will gain a clear understanding of constructor chaining in an inheritance hierarchy, observing how Java handles constructor calls in a multi-level class structure. Happy coding!
