package com.collection.com;

import java.util.Enumeration;
import java.util.Vector;

public class Vector1Ex {
    public static void main(String[] args) {
        Vector<Integer>vector=new Vector<>();
        vector.add(21);
        vector.add(33);
        vector.add(34);
        System.out.println(vector);
        Enumeration e=vector.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
