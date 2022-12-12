package com.collection.com;

import java.util.TreeSet;

public class TresSetEx1 {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        ts.add(new StringBuffer("java"));
        ts.add(new StringBuffer("DevOps"));
        ts.add(new StringBuffer("Mysql"));
        ts.add(new StringBuffer("Python"));
        System.out.println(ts);
    }
}
