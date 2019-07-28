package com.xenon.practice.java.code.collections;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        System.out.println("Hashtable is a legacy class");
        System.out.println("Hashtable cannot have null keys");
        System.out.println("Hashtable maintains no order");

        hashtable.put(1, "ONE");
        hashtable.put(3, "THREE");
        hashtable.put(5, "FIVE");
        hashtable.put(2, "TWO");
        hashtable.put(4, "FOUR");


        System.out.println(hashtable);
    }
}
