# Exercise: Managing a Product Catalog Using LinkedHashMap

## Objective
Learn how to use a `LinkedHashMap` in Java to store product details (product names and prices) while preserving the order of entries. This exercise simulates a product catalog system where products need to be displayed in the order they were added to the catalog.

## Instructions

**Step 1: Create a LinkedHashMap to Store Product Details**

1. **Create the `E191Map.java` class** with the following:
    - **LinkedHashMap Initialization:**
        - Initialize a `LinkedHashMap<String, Double>` to store product names as keys and their corresponding prices as values.

**Step 2: Add Products to the LinkedHashMap**

1. **Add the following product details to the LinkedHashMap**:
    - Add `"Laptop" = 1200.99`, `"Smartphone" = 799.99`, `"Tablet" = 499.99`, `"Smartwatch" = 199.99`, `"Headphones" = 149.99`.
    - **Explanation:** The `LinkedHashMap` will store these product entries in the order they are added, ensuring that the product catalog maintains the insertion order when displayed.

**Step 3: Print All Products and Their Prices from the LinkedHashMap**

1. **Use a for-each loop** to iterate through the entries of the `LinkedHashMap` and print both the product name and price one by one.

## Example InputOutput:

**Output:**

```plaintext
Product Catalog:
Laptop: $1200.99
Smartphone: $799.99
Tablet: $499.99
Smartwatch: $199.99
Headphones: $149.99
```

## Why Use a LinkedHashMap for Product Catalog?

- **Order Preservation:** When managing a product catalog, the order of products displayed might be important (e.g., products listed in the order they were added). A `LinkedHashMap` ensures the products are printed in the order they were added.
- **Efficient Retrieval:** You can quickly retrieve and display product details using the map’s keys, making it useful in applications such as online stores or inventory management systems.

Happy coding!