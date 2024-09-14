package org.example.e150;
class Person {
    // Private Instance Variables
    private String name;
    private String lastName;
    private int age;

    // Public Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// Employee.java
class Employee extends Person {
    // Instance Variable
    private int salary;

    // Public Getter and Setter
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Method to Print Employee Details
    public void printEmployeeDetails() {
        System.out.println(getName() + " " + getLastName() + " " + getAge() + " " + salary);
    }
}

// Student.java
class Student extends Employee {
    // Instance Variable
    private int grade;

    // Public Getter and Setter
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // Method to Print Student Details
    public void printStudentDetails() {
        System.out.println(getName() + " " + getLastName() + " " + getAge() + " " + grade);
    }
}

// Retiree.java
class Retiree extends Student {
    // Instance Variable
    private String seniorActivity;

    // Public Getter and Setter
    public String getSeniorActivity() {
        return seniorActivity;
    }

    public void setSeniorActivity(String seniorActivity) {
        this.seniorActivity = seniorActivity;
    }

    // Method to Print Retiree Details
    public void printRetireeDetails() {
        System.out.println(getName() + " " + getLastName() + " " + getAge() + " " + seniorActivity);
    }
}

public class E150Inheritance {
    public static void main(String[] args) {
// Create an Employee object
        Employee employee = new Employee();
        employee.setName("Joe");
        employee.setLastName("Smith");
        employee.setAge(35);
        employee.setSalary(35000);
        employee.printEmployeeDetails();

        // Create a Student object
        Student student = new Student();
        student.setName("Adam");
        student.setLastName("Smith");
        student.setAge(15);
        student.setGrade(10);
        student.printStudentDetails();

        // Create a Retiree object
        Retiree retiree = new Retiree();
        retiree.setName("Frank");
        retiree.setLastName("Smith");
        retiree.setAge(15);
        retiree.setSeniorActivity("tour");
        retiree.printRetireeDetails();
    }
}