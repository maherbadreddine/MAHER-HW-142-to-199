package org.example.e152;

class Building {

    //declare instance variable
    private String location;

    //parameterized constructor
    public Building(String location) {

        this.location = location;
        System.out.println(this.location);
    }

    //default constructor
    public Building() {
        System.out.println("Building Constructor");
    }

}

class House extends Building{

    //parameterized constructor
    public House(String location) {
        super(location);
    }

}


public class E152SuperKeyword {
    public static void main(String[] args) {

        //creates object of the House class and pass the String value "Vienna" to its constructor.
        House h = new House("Vienna");


    }
}
