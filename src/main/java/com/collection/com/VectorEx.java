package com.collection.com;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<String>vector=new Vector<>();
        vector.add("Sachin");
        vector.add(new String("Sehwagh"));
        vector.add("Kohli");
        vector.add("Dhoni");
        vector.add("Suresh");
        System.out.println(vector);
        System.out.println(vector.size());
    }
}
