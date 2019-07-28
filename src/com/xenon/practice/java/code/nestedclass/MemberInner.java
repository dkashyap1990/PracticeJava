package com.xenon.practice.java.code.nestedclass;


class Outer {
    Outer() {
        System.out.println("Inside outer class constructor");
    }

    void show() {
        System.out.println("Inside outer class method");
    }

    class Inner {
        Inner() {
            System.out.println("Inside inner class constructor");
        }

        void show() {
            System.out.println("Inside inner class method");
        }
    }
}


public class MemberInner {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.show();
        Outer.Inner inner = outer.new Inner();
        inner.show();
    }
}
