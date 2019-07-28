package com.xenon.practice.java.code.generics;

import java.util.ArrayList;
import java.util.List;

class Sorter<T extends Comparable<T>> {
    void sort(List<T> list) {
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                T x = list.get(j);
                T y = list.get(j + 1);
                if (x.compareTo(y) < 0) {
                    list.remove(j);
                    list.add(j, y);
                    list.remove(j + 1);
                    list.add(j + 1, x);
                }
            }
        }
    }
}

public class GenericSorter {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();

        list.add(10.0);
        list.add(8.7);
        list.add(12.3);
        list.add(08.5);
        list.add(6.5);
        list.add(12.5);
        list.add(8.5);
        list.add(11.0);

        System.out.println("Before sorting : " + list);
        new Sorter<Double>().sort(list);
        System.out.println("After sorting : " + list);
    }
}
