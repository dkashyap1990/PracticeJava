package com.xenon.practice.java.code.inheritance;

public class SingleInheritance {
    public static void main(String[] args) {
        B obj = new SingleInheritance().new B();
        obj.showA();
        obj.showB();
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
        {
            System.out.println("Inside instance initializer block B");
        }

        B() {
            System.out.println("Inside B constructor");
        }

        void showB() {
            System.out.println("Inside B method");
        }
    }
}
