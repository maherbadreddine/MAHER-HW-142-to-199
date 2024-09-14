package org.example.e176;


import java.util.ArrayList;

public class E176List {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(111);
        arrayList.add(222);
        arrayList.add(333);
        arrayList.add(444);
        arrayList.add(555);
        arrayList.add(666);

        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList);
    }

}