package com.xenon.practice.java.basics.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        HashMap<Integer, String> hashMap = new HashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        System.out.println("LinkedHashMap can have single null key multiple null values ");
        System.out.println("LinkedHashMap has insertion order");
        System.out.println("HashMap can have single null key multiple null values");
        System.out.println("HashMap has no insertion order");
        System.out.println("TreeMap can't have null key multiple null values");
        System.out.println("TreeMap has ascending order");


        linkedHashMap.put(2, "-2-");
        linkedHashMap.put(6, "-6-");
        linkedHashMap.put(3, "-3-");
        linkedHashMap.put(5, "-5-");
        linkedHashMap.put(7, "-7-");
        linkedHashMap.put(4, "-4-");
        linkedHashMap.put(1, "-1-");
        linkedHashMap.put(9, "-9-");
        linkedHashMap.put(8, "-8-");

        hashMap.putAll(linkedHashMap);
        treeMap.putAll(linkedHashMap);

        System.out.println("LinkedHashMap : " + linkedHashMap);
        System.out.println("Hash Map      : " + hashMap);
        System.out.println("Tree Map      : " + treeMap);
    }
}
