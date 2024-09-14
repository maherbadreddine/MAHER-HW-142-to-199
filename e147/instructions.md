# Exercise: Implementing a Car Object Class with Stock Value Calculation

## Objective
Learn how to create a Java class with instance variables, constructors, and methods to perform calculations. You will practice initializing objects, using the `this` keyword, and performing basic mathematical operations.

## Instructions

**Step 1: Define Instance Variables in CarObject Class**

1. **Create the `CarObject.java` class** and define the following instance variables:
    - `model`: Stores the model of the car. (String)
    - `price`: Stores the price of a single car. (double)
    - `quantity`: Stores the number of cars in stock. (int)

   **Note:** Use proper naming conventions for all variables. The instance variables should be defined as `private` to ensure encapsulation.

**Step 2: Implement the Constructor**

1. **Create a constructor** in the `CarObject` class that accepts three parameters:
    - `model`: The model of the car.
    - `price`: The price of a single car.
    - `quantity`: The number of cars in stock.

2. The constructor should initialize the instance variables using the values passed as arguments. Use the `this` keyword to differentiate between instance variables and parameters.

   **Example Constructor Implementation (Explanation):**
    - The constructor should take the model, price, and quantity of cars as input.
    - It should set the corresponding instance variables (`model`, `price`, and `quantity`) using the `this` keyword.

**Step 3: Create a Method to Calculate and Display Car Stock Value**

1. **Create a method called `carStockValue`** in the `CarObject` class that calculates the total value of cars in stock and prints the result.

   **Logic (Explanation):**
    - Multiply the `price` by the `quantity` to get the total stock value.
    - Print the result in the following format: `"Model Stock Value TotalValue"`.
    - For example, if the model is "Toyota 2019", the stock value should be printed as `"Toyota 2019 Stock Value 2500000.0"`.

**Step 4: Test the CarObject Class in the Main Class**

1. **In the `Main` class:**
    - Create two objects of the `CarObject` class with different models, prices, and quantities.
    - Call the `carStockValue` method on each object to print the total stock value for each car model.

   **Example Steps (Explanation):**
    - Create an object of the `CarObject` class for a car model "Toyota 2019" with a price of 50000.0 and a quantity of 50.
    - Create another object of the `CarObject` class for a car model "BMW 2019" with a price of 10883.0 and a quantity of 60.
    - Call the method that calculates and prints the stock value for each car.

**Step 5: Run Your Application**

1. Execute your program to verify that the output matches the expected results.

### Example Output:

- When you run your program, you should see the following output:

  ```
  Toyota 2019 Stock Value 2500000.0
  BMW 2019 Stock Value 652980.0
  ```

## Assignment Goal:

- **Clean Code:** Ensure your code is well-organized and follows best practices.
- **This Keyword:** Use the `this` keyword to refer to instance variables within the constructor.
- **Method Creation:** Practice creating and calling methods within a class.
- **Mathematical Operations:** Perform basic mathematical operations to calculate the total stock value.

By completing this exercise, you will gain experience in working with instance variables, constructors, methods, and basic arithmetic operations in Java. Happy coding!
