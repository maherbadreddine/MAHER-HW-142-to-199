package org.example.e172;

class Customer{
    private long accountNumber;
    private String fullName;
    private String email;
    private double balance;

    public Customer(long accountNumber,String fullName, String email, double balance){
        this.accountNumber = accountNumber;
        this.fullName = fullName;
        this.email = email;
        this.balance = balance;
    }
    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }
    public long getAccountNumber(){
        return (accountNumber);
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getFullName(){
        return (fullName);
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return (email);
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return (balance);
    }

}

public class E172Encapsulation {
    public static void main(String[] args){
        Customer c = new Customer(1234567890,"Sarah Connor","sarah.connor@example.com",15000.0);
        c.setAccountNumber(1234567890);
        c.setFullName("Sarah Connor");
        c.setEmail("sarah.connor@example.com");
        c.setBalance(15000.0);
        System.out.println("Account Number: " +c.getAccountNumber());
        System.out.println("Full Name: " +c.getFullName());
        System.out.println("Email: " +c.getEmail());
        System.out.println("Account Balance: " +c.getBalance());
    }

}

