package com.xenon.practice.java.code.collections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            linkedHashSet.add(random.nextInt(50));
        }

        System.out.println("LinkedHashSet has max single null value and maintains insertion order");
        System.out.println("HashSet has max single null value and maintains no order");
        System.out.println("TreeSet has no null value and maintains ascending order");
        System.out.println();

        hashSet.addAll(linkedHashSet);
        treeSet.addAll(linkedHashSet);

        System.out.println("Linked Hash set : " + linkedHashSet);
        System.out.println("Hash set        : " + hashSet);
        System.out.println("Tree set        : " + treeSet);

    }
}
