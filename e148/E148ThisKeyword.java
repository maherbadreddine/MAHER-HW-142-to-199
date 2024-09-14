package org.example.e148;

class ShoppingStore {
    private String item;
    private double price;
    private int quantity;

    public ShoppingStore(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }

    public double itemTotalPrice() {
        double totalValue =price * quantity;
        System.out.println(item + " " + "Total Value " + price * quantity);
        return totalValue;
    }

}




public class E148ThisKeyword {
    public static void main(String[] args){
        double totalSum, sum1 ,sum2;
        ShoppingStore s = new ShoppingStore("Blanket",49.99,2);

        sum1= s.itemTotalPrice();
        ShoppingStore s1 = new ShoppingStore("Mattress",219.59,2);
        sum2 = s1.itemTotalPrice();

        totalSum = sum1 + sum2 ;

        System.out.println("You purchased " + totalSum + " Today");





    }
}
   