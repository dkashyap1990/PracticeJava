package com.xenon.practice.java.code.inheritance;

public class MultilevelInheritance {
    public static void main(String[] args) {
        C c = new MultilevelInheritance().new C();
        c.showA();
        c.showB();
        c.showC();
    }

    class A {
        A() {
            System.out.println("Inside A constructor");
        }

        void showA() {
            System.out.println("Inside A method");
        }
    }

    class B extends A {
        B() {
            System.out.println("Inside B constructor");
        }

        void showB() {
            System.out.println("Inside B method");
        }
    }

    class C extends B {
        C() {
            System.out.println("Inside C constructor");
        }

        void showC() {
            System.out.println("Inside C method");
        }
    }
}
