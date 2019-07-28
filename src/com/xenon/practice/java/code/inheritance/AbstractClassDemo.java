package com.xenon.practice.java.code.inheritance;

abstract class AbsA {
    AbsA() {
        System.out.println("Inside abstract class A constructor");
    }

    void show() {
        System.out.println("Inside abstract class A normal method");
    }

    abstract void showAbs();
}

abstract class AbsB extends AbsA {
    AbsB() {
        System.out.println("Inside abstract class B constructor");
    }

    void show() {
        System.out.println("Inside abstract class B normal method");
    }
}

public class AbstractClassDemo extends AbsB {
    public static void main(String[] args) {
        AbstractClassDemo abs = new AbstractClassDemo();
        abs.showAbs();
        abs.show();
    }

    @Override
    void showAbs() {
        System.out.println("Inside abstract class A abstract method");
    }
}
