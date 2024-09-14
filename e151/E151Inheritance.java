package org.example.e151;


class BankAccount {

    //declare instance variable
    private String accountHolderName;
    private String accountNumber;
    private double balance;


    //initialize the instance variables
    public BankAccount(String accountHolderName, String accountNumber, double balance ) {

        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;


    }

    //getter - to get account balance
    public double getBalance() {
        return  balance;
    }

    //setter - to update account balance
    public void setBalance(double amount) {
        this.balance =amount;

    }

    /* capture deposit amount and update the balance accordingly */
    public void deposit(double amount) {

        balance = balance + amount;

    }




    /* captures withdrawal amount and update the balance accordingly */
    public void withdraw(double amount) {

        if(balance >= amount) {
            balance = balance - amount;
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

    //Print account holder info
    public void printAccountInfo() {

        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + String.format("%.1f", balance) );
        System.out.println();

    }
}

////////CHECKING ACCOUNT//////////


class CheckingAccount extends BankAccount {

    //declare instance variable
    private double overdraftLimit;

    //initialize instance variables
    public CheckingAccount(String accountHolderName, String accountNumber, double balance, double overdraftLimit ) {

        super(accountHolderName, accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    //method override -> to update balance based on withdrawal
    public void withdraw(double amount) {

        if (getBalance() - amount >= overdraftLimit) {
            setBalance(getBalance() - amount);
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

}

////////SAVINGS ACCOUNT//////////


class SavingsAccount extends BankAccount {

    //declare instance variable
    private double interestRate;

    //initialize the instance variables
    public SavingsAccount(String accountHolderName, String accountNumber, double balance, double interestRate) {

        super(accountHolderName,accountNumber,balance);
        this.interestRate = interestRate;
    }


    /* calculates the interest based on the current balance and the interest rate,
    then adds this interest to the balance */
    public void applyInterest() {

        double newBalance = getBalance() + ( (interestRate/getBalance())*100);
        setBalance(newBalance);

    }
}
//////////MAIN CLASS/////////


public class E151Inheritance {
    public static void main(String[] args) {

        //creates object for SavingsAccount class
        SavingsAccount s = new SavingsAccount("John Doe", "123456789", 1000.0, 0.01);

        //depositing amount
        s.deposit(50);

        //applying interest rate
        s.applyInterest();

        //printing account info
        s.printAccountInfo();

        //creates object for CheckingAccount class
        CheckingAccount c = new CheckingAccount("Jane Smith", "987654321", 1000, -100);

        //withdrawing amount
        c.withdraw(1050);

        //printing account info
        c.printAccountInfo();

    }
}