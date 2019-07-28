package com.xenon.practice.java.basics;

class SDemo {
    static String var;

    static {
        System.out.println("Inside Static block");
        System.out.println("It executes once");
        var = "Static String";
        showS();
    }

    SDemo() {
        System.out.println("Inside constructor");
    }

    static void showS() {
        System.out.println("Inside static method");
        System.out.println("Static variable : " + var);
    }

    void show() {
        System.out.println("Inside non static method");
        System.out.println();
    }
}

public class StaticConcept {
    public static void main(String[] args) {
        SDemo sDemo = new SDemo();
        sDemo.show();
        new SDemo().show();
    }
}
