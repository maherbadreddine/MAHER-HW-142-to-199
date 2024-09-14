package org.example.e157;

class TransactionCalculator {
    private int profit;

    public int calculateProfit(int totalRevenue, int costOfTransac1) {
        profit = totalRevenue - costOfTransac1;
        return profit;
    }

    public int calculateProfit(int totalRevenue, int costOfTransac1, int costOfTransac2) {
        profit = totalRevenue - (costOfTransac1 + costOfTransac2);
        return profit;
    }

    public int calculateProfit(int totalRevenue, int costOfTransac1, int costOfTransac2, int costOfTransac3) {
        profit = totalRevenue -(costOfTransac1+costOfTransac2+costOfTransac3);
        return profit;
    }
}
public class E157MethodOverloading {
    public static void main(String[] args) {

        TransactionCalculator tC = new TransactionCalculator();
        System.out.println(tC.calculateProfit(100,20,30,10));
        System.out.println(tC.calculateProfit(80,30,20));
        System.out.println(tC.calculateProfit(50,30));
    }
}

