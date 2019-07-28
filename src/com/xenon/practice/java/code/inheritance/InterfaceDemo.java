package com.xenon.practice.java.code.inheritance;

interface InfA {
    void showA();
}

interface InfB extends InfA {
    void showB();

    default void show() {
        System.out.println("Inside Interface B default method");
    }
}

interface InfC {
    static void showS() {
        System.out.println("Inside Interface C static method");
    }

    default void show() {
        System.out.println("Inside Interface C default method");
    }
}

public class InterfaceDemo implements InfB, InfC {
    public static void main(String[] args) {
        InterfaceDemo interfaceDemo = new InterfaceDemo();
        interfaceDemo.show();
        interfaceDemo.showA();
        interfaceDemo.showB();

        InfC.showS();
    }

    @Override
    public void showA() {
        System.out.println("Inside Interface A normal method");
    }

    @Override
    public void showB() {
        System.out.println("Inside Interface B normal method");
    }

    @Override
    public void show() {
        InfB.super.show();
        InfC.super.show();
    }
}
