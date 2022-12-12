package com.collection.com;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("Pramod");
        arrayList.add("it");
        arrayList.add("java");
        arrayList.add("training");
        Iterator<String >iterator=arrayList.iterator();
        while (iterator.hasNext()){
            String next=iterator.next();
            System.out.println(next);
        }
    }
}
