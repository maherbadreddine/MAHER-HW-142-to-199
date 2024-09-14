package org.example.e160;

public class E160MethodOverloading {

    public static class BankAccount {


        private void displayInfo() {
            System.out.println("private displayInfo method");
        }
        private void displayInfo(int balance){
            System.out.println("private displayInfo method with balance: " + balance);
        }
        static void displayBankInfo(){
            System.out.println("static method without parameter");
        }
        static void displayBankInfo(int branches){
            System.out.println("static method with int parameter: " + branches);
        }

    }

    public static void main(String[] args) {
        BankAccount bc = new BankAccount();

        bc.displayInfo();
        bc.displayInfo(5000);
        bc.displayBankInfo();
        bc.displayBankInfo(20);


    }
}