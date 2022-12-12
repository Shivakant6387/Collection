package com.collection.com;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList<>();
        linkedList.add(40);
        linkedList.add(null);
        System.out.println(linkedList);
        linkedList.add("java");
        System.out.println(linkedList);
        linkedList.add("oracle");
            linkedList.set(0,"oracle");
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);
        linkedList.addFirst("Hello");
        System.out.println(linkedList);
    }
}
