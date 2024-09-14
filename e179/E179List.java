package org.example.e179;

import java.util.LinkedList;

public class E179List {

    public static void main(String[] args){

        LinkedList<Integer> numList = new LinkedList<>();
        for(int i = 50; i <= 100; i++){
            numList.add(i);
        }
        for(int i = 0; i < numList.size(); i ++){
            if(numList.get(i) % 3 !=0){
                numList.remove(i);
                i --;
            }
        }
        System.out.println(numList);
    }


}