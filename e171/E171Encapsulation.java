package org.example.e171;

class Employee{
    private String empName;
    private int empAge;
    public String getEmpName(){
        return (empName);
    }
    public void setEmpName(String empName){
        this.empName=empName;
    }
    public int getEmpAge (){
        return (empAge);
    }
    public void setEmpAge(int empAge){
        this.empAge=empAge;
    }
}



public class E171Encapsulation {
    public static void main(String[] args){
        Employee person = new Employee();
        person.setEmpName("John");
        person.setEmpAge(30);
        System.out.println("Employee Name: "+person.getEmpName());
        System.out.println("Employee Age: "+ person.getEmpAge());
    }
}



