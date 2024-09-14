package org.example.e158;

class LoanPaymentCalculator{
    private double payment;
    public double calculatePayment(double loanAmount, double interestRate){
        payment = (loanAmount * (1 + interestRate/100)) / 12;
        return payment;
    }
    public double calculatePayment(double loanAmount,double interestRate,int numberOfMonths){
        payment = (loanAmount * (1 + interestRate/100))/ numberOfMonths;
        return payment;
    }
    public double calculatePayment(double loanAmount,double interestRate,int numberOfMonths,double downPayment){
        payment = ((loanAmount - downPayment) * (1 + interestRate / 100)) / numberOfMonths;
        return payment;
    }

}

public class E158MethodOverloading {
    public static void main(String[] args){
        double monthlyPayment;
        LoanPaymentCalculator lp =new LoanPaymentCalculator();

        monthlyPayment = lp.calculatePayment(10000,5);
        System.out.println(String.format("%.2f",monthlyPayment));

        monthlyPayment = lp.calculatePayment(10000,5,24);
        System.out.println(String.format("%.2f", monthlyPayment));

        monthlyPayment = lp.calculatePayment(10000,5,24,2000);
        System.out.println(String.format("%.2f",monthlyPayment));
    }
}