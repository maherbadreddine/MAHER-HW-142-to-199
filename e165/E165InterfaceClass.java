package org.example.e165;
interface ElectronicDevice{
    void turnOff();
    void turnOn();
}
class Smartphone implements ElectronicDevice{
    public void turnOn(){
        System.out.println("Smartphone is turning on");
    }
    public void turnOff(){
        System.out.println("Smartphone is turning off");
    }
}
class Laptop implements ElectronicDevice {
    public void turnOn() {
        System.out.println("Laptop is turning on");
    }

    public void turnOff() {
        System.out.println("Laptop is turning off");
    }
}

public class E165InterfaceClass {

    public static void main(String[] args) {
        Smartphone obj1=new Smartphone();
        obj1.turnOn();
        obj1.turnOff();
        Laptop obj2=new Laptop();
        obj2.turnOn();
        obj2.turnOff();
    }

}