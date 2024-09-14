package org.example.e147;

class CarObject{
    private String model;
    private double price;
    private int quantity;

    public CarObject(String model, double price, int quantity){
        this.model=model;
        this.price=price;
        this.quantity=quantity;

    }
    void carStockValue(){
        System.out.println(model+" "+"Stock Value" +" "+price*quantity);
    }

}


public class E147ThisKeyword {
    public static void main(String[] args) {
        CarObject obj = new CarObject("Toyota 2019",50000.0,50);
        obj.carStockValue();
        CarObject obj1 = new CarObject("BMW 2019",10883.0,60);
        obj1.carStockValue();


    }
}