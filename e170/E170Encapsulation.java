package org.example.e170;

class Customer{
    private String customerName;
    private int customerAge;
    public String getCustomerName(){
        return (customerName);
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public int getCustomerAge(){
        return (customerAge);
    }
    public void setCustomerAge(int customerAge){
        this.customerAge = customerAge;
    }
}

public class E170Encapsulation {
    public static void main(String[] args) {
        Customer person=new Customer();
        person.setCustomerName("Mario");
        person.setCustomerAge(32);
        System.out.println("Customer Name: "+person.getCustomerName());
        System.out.println("Customer Age: "+person.getCustomerAge());
    }
}




