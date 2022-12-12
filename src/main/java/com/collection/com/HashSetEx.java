package com.collection.com;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet<>();
        hs.add(23);
        hs.add(43);
        hs.add(null);
        hs.add(54);
        hs.add(32);
        System.out.println(hs);
        for(Integer e:hs){
            System.out.println(e);
        }
        Iterator iterator=hs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
