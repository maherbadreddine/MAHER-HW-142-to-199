package org.example.e168;

interface Transaction{
    void processTransaction(double amount);
}
interface BankOperations extends Transaction{
    double deposit(double amount);
    double withdraw(double amount);
    double checkBalance();
}
class BankAccount implements BankOperations{
    private double balance;
    BankAccount(double balance){
        this.balance=balance;
    }
    public void processTransaction(double amount){
        System.out.print("Transaction successful: ");
    }
    public double deposit(double amount){
        processTransaction(amount);
        System.out.println("Deposited "+amount);
        balance=balance+amount;
        return (balance);
    }
    public double withdraw(double amount) {
        if (balance >= amount) {
            processTransaction(amount);
            System.out.println("Withdrew "+amount);
            balance=balance-amount;
            return (balance);
        } else {
            System.out.println("Transaction failed: Insufficient funds");
            return (balance);
        }
    }
    public double checkBalance(){
        System.out.println("Current Balance: "+balance);
        return balance;
    }
}

public class E168MultipleInterface {

    public static void main(String[] args){
        BankAccount account=new BankAccount(0);
        account.deposit(100);
        account.withdraw(50);
        account.checkBalance();
        account.withdraw(60);
    }
}