package com.xenon.practice.java.code.functional;

@FunctionalInterface
interface Adder {
    void add(int a, int b);
}

public class InterfaceNew {
    public static void main(String[] args) {

        System.out.println("Anonymous class style");
        Adder adder = new Adder() {
            @Override
            public void add(int a, int b) {
                System.out.println(a + "+" + b + "=" + (a + b));
            }
        };
        adder.add(4, 5);
        System.out.println("Java 8 functional style");
        Adder adder1 = (int a, int b) -> System.out.println(a + "+" + b + "=" + (a + b));
        adder1.add(6, 11);
    }
}
