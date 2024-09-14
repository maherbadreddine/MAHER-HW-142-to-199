package org.example.e178;

import java.util.ArrayList;
import java.util.Scanner;

public class E178List {
    public static void main(String[] args) {

        ArrayList<String > groceryItems = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 grocery items:");
        for( int i = 0;i < 5; i++){
            groceryItems.add(i, scan.nextLine());
        }

        for (int i = 0; i <groceryItems.size(); i++){
            for (int j = i + 1; j <groceryItems.size(); j++){
                if(groceryItems.get(i).equals(groceryItems.get(j))){
                    groceryItems.remove(j);
                    j--;
                }
            }
        }
        System.out.println("Unique grocery items:");
        System.out.println(String.join(" ", groceryItems));
    }
}
