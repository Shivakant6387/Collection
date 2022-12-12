package com.collection.com;

import java.util.SortedSet;
import java.util.TreeSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        SortedSet ss=new TreeSet();
        for (int i=10; i<=20;i++)
            ss.add(i);
        System.out.println(ss.first());
        System.out.println(ss.last());
        System.out.println(ss.headSet(16));
        System.out.println(ss.tailSet(18));
        System.out.println(ss.subSet(12,17));

        System.out.println(ss.comparator());
    }
}
