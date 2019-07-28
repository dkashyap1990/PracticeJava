package com.xenon.practice.java.basics.nestedclass;

class OuterClass {
    OuterClass() {
        System.out.println("Inside outer class constructor");
    }

    void show() {
        System.out.println("Inside outer class method");

        class InnerClass {
            InnerClass() {
                System.out.println("Inside inner class constructor");
            }

            void show() {
                System.out.println("Inside inner class method");
            }
        }
        new InnerClass().show();
    }
}

public class LocalInner {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.show();
    }
}
