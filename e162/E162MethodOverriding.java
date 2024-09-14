package org.example.e162;

class Animal{
    String type;
    Animal(String type){
        this.type=type;
    }
    Animal(){

    }
    public void eat(){
        System.out.println("I am an animal eating");
    }
    protected void sleep(){
        System.out.println("I am an animal sleeping");
    }
    void makeSound(){
        System.out.println("I am an animal making sound");
    }
    private void roam(){
        System.out.println("I am animal roaming");
    }
}
class Cat extends Animal{
    Cat (){
        type="Cat";
    }
    protected void sleep(){
        System.out.println(type+" sleeps a lot");
    }
    void makeSound(){
        System.out.println(type+" makes a sound");
    }
    public void eat(){
        System.out.println(type+" eats");
    }
}
class Kitten1 extends Cat{
    Kitten1(){
        type="kitten1";
    }
    public void eat() {
        System.out.println(type+" eats milk");
    }
}
class Kitten2 extends Cat{
    Kitten2(){
        type="kitten2";
    }
    public void eat() {
        System.out.println(type+" eats snacks");
    }
}
class Kitten3 extends Cat{
    Kitten3(){
        type="kitten3";
    }
    public void eat() {
        System.out.println(type+" eats everything");
    }
}


public class E162MethodOverriding {
    public static void main(String[] args) {
        Cat animal1=new Cat();
        Kitten1 animal2=new Kitten1();
        Kitten2 animal3=new Kitten2();
        Kitten3 animal4=new Kitten3();
        Animal [] animals={animal1, animal2, animal3, animal4};
        for (Animal animal:animals){
            animal.eat();
            animal.sleep();
        }
        animal1.makeSound();
    }
}