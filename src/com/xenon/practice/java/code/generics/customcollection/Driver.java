package com.xenon.practice.java.code.generics.customcollection;

public class Driver {
    public static void main(String[] args) {
        CustomList<Double> list = new CustomList<>();

        list.add(1.0);
        list.add(2.0);
        list.add(3.0);
        list.add(4.0);
        list.add(5.0);
        list.add(6.0);
        list.add(7.0);
        System.out.println(list + "\n");
    }
}
