package org.example.e196;

import java.util.*;

public class E196Map {

    public static void main(String[] args) {

        Map<String, List<String>> departmentEmployees = new HashMap<>();

        // Create ArrayLists for Employees in Each Department
        List<String> hrEmployees = new ArrayList<>();
        List<String> itEmployees = new ArrayList<>();
        List<String> financeEmployees = new ArrayList<>();

        // Step 2: Add Employees to the Lists
        hrEmployees.add("Alice");
        hrEmployees.add("Bob");

        itEmployees.add("Charlie");
        itEmployees.add("David");
        itEmployees.add("Eve");

        financeEmployees.add("Frank");
        financeEmployees.add("Grace");

        // Step 3: Add the Employee Lists to the Map
        departmentEmployees.put("HR", hrEmployees);
        departmentEmployees.put("IT", itEmployees);
        departmentEmployees.put("Finance", financeEmployees);

        // Step 4: Print Each Department and Employees
        for (Map.Entry<String, List<String>> entry : departmentEmployees.entrySet()) {
            String department = entry.getKey();
            List<String> employees = entry.getValue();
            System.out.println("Department: " + department + " Employees: " + employees);
        }

        // Additional examples using different Map methods
        System.out.println("\nDepartments:");
        for (String department : departmentEmployees.keySet()) {
            System.out.println(department);
        }

        System.out.println("\nAll Employees:");
        for (List<String> employeeList : departmentEmployees.values()) {
            for (String employee : employeeList) {
                System.out.println(employee);
            }
        }
    }
}