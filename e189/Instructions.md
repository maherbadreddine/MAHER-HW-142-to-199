# Exercise: Managing Unique Email Addresses Using `LinkedHashSet`

## Objective
Learn how to use a `LinkedHashSet` in Java to store unique email addresses, prevent duplicates from being added, and print the email addresses using a `for-each` loop.

## Instructions

**Step 1: Create a `LinkedHashSet` to Store Email Addresses**

1. **Create the `E189Set.java` class** with the following:
   - **LinkedHashSet Initialization:**
      - Initialize a `LinkedHashSet<String>` to store email addresses, which will preserve the order in which they were added and ensure that duplicates are not stored.

**Step 2: Add Email Addresses to the `LinkedHashSet`**

1. **Add the following email addresses to the `LinkedHashSet`**:
   - Add `null`, `"john.doe@example.com"`, `"jane.smith@example.com"`, `"john.doe@example.com"` (duplicate), `"admin@event.com"`, and `"info@company.com"`.
   - **Explanation:** A `LinkedHashSet` allows one `null` value, maintains insertion order, and prevents duplicate entries. If a user registers multiple times with the same email, only the first entry will be kept.

**Step 3: Print Email Addresses Using a For-Each Loop**

1. **Use a for-each loop** to iterate through the `LinkedHashSet` and print the email addresses one by one.
   - **Explanation:** The `for-each` loop ensures that you can go through the `LinkedHashSet` efficiently without needing iterators.

## Example InputOutput:

**Output:**

```plaintext
null
john.doe@example.com
jane.smith@example.com
admin@event.com
info@company.com
```

## Why Use a `LinkedHashSet` for Email Collection?

- **Order Preservation:** The order in which email addresses are registered is important for tracking purposes, and `LinkedHashSet` ensures this order is preserved.
- **No Duplicates:** It's essential to avoid sending multiple emails to the same email address. The `LinkedHashSet` ensures that each email address is stored only once, even if it’s added multiple times.

Happy coding!
