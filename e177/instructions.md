# Exercise: Managing and Displaying Group Chat Messages Using an ArrayList

## Objective
Learn how to use an ArrayList in Java to manage user input for chat messages in a group chat. You will store messages using the `Scanner` class, remove specific ones, and print the remaining messages in a single line.

## Instructions

**Step 1: Create an ArrayList for Chat Messages**

1. **Create the `E185GroupChatApp.java` class** with the following:
    - **ArrayList Initialization:**
        - Initialize an `ArrayList<String>` to store chat messages entered by the user.
    - **Input Chat Messages:**
        - Use the `Scanner` class to input 5 chat messages from the user.
    - **Remove Specific Messages:**
        - Simulate removing unwanted messages by removing the 1st, 3rd, and 5th elements (index 0, 2, and 4).
    - **Print Remaining Messages:**
        - Print the remaining chat messages in a single line, separated by spaces.

**Step 2: Print the Results**

1. **Main Method:**
    - Input messages from the user, remove specific ones, and print the remaining messages in one line.

## Example InputOutput:

**Input:**

```plaintext
Hi
How are you?
Great to see you!
Thanks!
Goodbye!
```

**Output:**

```plaintext
How are you? Thanks!
```

## Tips:

- **ArrayList Operations:** Use the `remove(index)` method to remove elements at specific indices in the ArrayList.
- **Scanner Class:** Use the `Scanner` class to take user input for chat messages.
- **Real-World Example:** This exercise simulates managing chat messages in a group conversation where certain messages are removed, and the remaining messages are displayed.

Happy coding!
