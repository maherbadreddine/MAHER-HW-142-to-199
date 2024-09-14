package org.example.e154;

class Appliance{

    int whattage;
    public Appliance(){
        System.out.println("Appliance Constructor without argument");
    }

    public Appliance(int whattage){

        System.out.println("Wattage: " +whattage);
    }
}
class WashingMachine extends Appliance{
    public  WashingMachine(){
        System.out.println("WashingMachine Constructor without argument");
    }
    public WashingMachine(int whattage,int capacity){
        super(whattage);
        System.out.println("Capacity: " +capacity);

    }
}


public class E154SuperKeyword {
    public static void main(String[] args) {
        WashingMachine w = new WashingMachine();
        WashingMachine w1 = new WashingMachine(500,7);

    }
}