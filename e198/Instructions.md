# Exercise: Working with config.properties in java

## Objective
Learn how to use a `config.properties` file to store configuration data in a Selenium project and how to load and access this data from Java code.

## Scenario
You are developing a Selenium test suite where various configuration details like browser type, URL, and timeouts need to be specified. Instead of hardcoding these values into your test scripts, you will store them in a `config.properties` file and access them through Java code.

## Instructions

### Step 1: Create the config.properties File

1. **Create a `config.properties` file** inside the `resources` folder of your project (or any other preferred directory).
   - This file will store configuration data as key-value pairs.

2. **Add configuration keys** such as:
   - `browser` to specify the browser type.
   - `url` for the application's URL.
   - `implicitWait` for the wait time before operations timeout.

---

### Step 2: Write Java Code to Load Properties

1. **Use a Java class** (e.g., `ConfigReader`) to load the `config.properties` file.
   - Use `FileInputStream` to read the file and `Properties` class to load the properties.

2. **Hint for accessing properties**:
   - Use a method to return the values of `browser`, `url`, and `implicitWait` from the file.

---

### Step 3: Use Properties in Your Selenium Test

1. **Integrate the configuration into your test**:
   - Retrieve the browser, URL, and wait time values using your `ConfigReader`.
   - Set up the WebDriver based on the browser type from the `config.properties`.
   - Apply the implicit wait from the properties file.

2. **Hint**:
   - Decide on the browser dynamically (Chrome, Firefox, etc.) using conditional logic.
   - Use the `URL` and `implicitWait` values in your Selenium test to navigate and handle timeouts.

---

## Example Output:
```
Browser: chrome URL: https://www.syntaxprojects.com/ Implicit Wait: 10 seconds
```

---

## Key Points to Remember:

- **Properties File**: Use the `config.properties` file to store key-value configuration data, making it easier to modify without altering code.
- **Loading Properties**: Use Java's `Properties` class to read the file and retrieve values.
- **Dynamic Configuration**: Use the properties to control browser type, URL, and wait times, enhancing flexibility in your Selenium tests.
