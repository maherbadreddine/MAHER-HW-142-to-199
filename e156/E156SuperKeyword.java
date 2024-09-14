package org.example.e156;

class Animal{
    String sound ="Some generic animal sound";


}
class Dog extends Animal {
    String sound = "Bark";


    public void displaySound() {

        System.out.println(sound);
        System.out.println(super.sound);



    }
}

public class E156SuperKeyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.displaySound();
    }
}