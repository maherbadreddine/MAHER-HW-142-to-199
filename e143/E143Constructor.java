package org.example.e143;

class  Car {

    private String make;
    private String model;
    private int numberOfDoors;
    private int topSpeed;
    private double price;

    public Car(String make, String model, int numberOfDoors, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }


    public void display() {


        System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
    }

}
public class E143Constructor {

    public static void main(String[] args) {
        Car c = new Car ("Toyota","Prius",4,120,30000.0);
        c.display();
        Car c1 = new Car("Toyota","Prius",4,120,30000.0);
        c1.display();

        Car c2 = new Car("unknown","unknown",4,120,30000.0);
        c2.display();
        Car c3 = new Car("Toyota","Prius",4,90,0.0);
        c3.display();
    }
}
