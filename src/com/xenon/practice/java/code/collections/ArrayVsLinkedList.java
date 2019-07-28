package com.xenon.practice.java.code.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayVsLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        for (int i = 0; i < 200000; i++) {
            list1.add(i);
            list2.add(i);
        }

        long t = System.currentTimeMillis();
        for (int i = 0; i < list1.size(); i++) {
            list1.get(i);
        }
        t = System.currentTimeMillis() - t;
        System.out.println("Time required to traverse" +
                " array list with for loop : " + t);

        t = System.currentTimeMillis();
        for (int i = 0; i < list2.size(); i++) {
            list2.get(i);
        }
        t = System.currentTimeMillis() - t;
        System.out.println("Time required to traverse" +
                " linked list with for loop : " + t);


        t = System.currentTimeMillis();
        Iterator<Integer> it1 = list1.iterator();

        while (it1.hasNext()) {
            it1.next();
        }
        t = System.currentTimeMillis() - t;
        System.out.println("Time required to traverse" +
                " array list with iterator : " + t);


        t = System.currentTimeMillis();
        Iterator<Integer> it2 = list2.listIterator();
        while (it2.hasNext()) {
            it2.next();
        }
        t = System.currentTimeMillis() - t;
        System.out.println("Time required to traverse" +
                " linked list with list iterator : " + t);


    }
}
