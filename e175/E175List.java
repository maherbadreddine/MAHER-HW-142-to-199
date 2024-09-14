package org.example.e175;

import java.util.ArrayList;

public class E175List {
    public static void main(String[] args){

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(111);
        arrayList.add(111);
        arrayList.add(111);
        arrayList.add(999);
        arrayList.add(999);
        arrayList.add(999);


        for(int i =0; i< arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }

}