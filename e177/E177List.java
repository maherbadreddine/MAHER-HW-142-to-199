package org.example.e177;

import java.util.ArrayList;
import java.util.Scanner;

public class E177List {


    public static void main(String[] args) {

        ArrayList<String> chatMessages = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        for(int i =0; i< 5; i++){
            chatMessages.add(i, scan.nextLine());

        }

        for(int j = chatMessages.size(); j> 0; j -=2){
            chatMessages.remove(j - 1);
        }
        chatMessages.removeIf(x -> x.equals("Hi"));
        chatMessages.removeIf(x -> x.equals("Great to see you"));
        chatMessages.removeIf(x -> x.equals("Goodbye"));
        System.out.println("Remaining messages:");
        System.out.println(String.join(" ",chatMessages));

        scan.close();

    }
}