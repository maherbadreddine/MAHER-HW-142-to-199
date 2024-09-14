package org.example.e164;

abstract class Vehicle{
    abstract void startEngine();
    void stopEngine(){
        System.out.println("Vehicle engine stopped");
    }

}
class Car extends Vehicle{
    void startEngine(){
        System.out.println("Car engine started");
    }
    void startEngine(String keyType){
        System.out.println("Car engine started with "+keyType);
    }
}

public class E164AbstractClass {
    public static void main(String[] args){
        Car car1=new Car();
        car1.startEngine();
        car1.startEngine("a smart key");
        car1.stopEngine();
    }
}
