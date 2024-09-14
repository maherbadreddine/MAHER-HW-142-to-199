package org.example.e149;

class vehicle{

    String make;
    int year ;

    void displayInfo(){
        System.out.println("Vehicle: " + make + ", Year: " + year);
    }
}
class Car extends vehicle{
    String model;

    void displayCarInfo(){
        System.out.println("Model: " + model);

    }
}

public class E149Inheritance {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.make = "Toyota";
        c1.year = 2020;
        c1.model = "Cor0lla";
        c1.displayInfo();
        c1.displayCarInfo();

    }



}