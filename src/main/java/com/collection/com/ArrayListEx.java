package com.collection.com;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList<>();
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);
        arrayList.add("java");
        arrayList.add("hyd");
        System.out.println(arrayList);
    }
}
