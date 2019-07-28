package com.xenon.practice.java.basics.exceptions;

public class Exception5 {
    public static void main(String[] args) {
        System.out.println("Exception declaration in overriding");
        Child child = new Exception5().new Child();
        child.methodA();
        child.methodB();
        child.methodC();
    }

    class Parent {
        void methodA() {
            System.out.println("If parent class method declare no exception");
        }


        void methodB() {
            System.out.println("If parent class method declare no exception");
        }


        void methodC() throws RuntimeException {
            System.out.println("If parent class method declare unchecked exception");
        }
    }

    class Child extends Parent {
        @Override
        void methodA() {
            super.methodA();
            System.out.println("Overridden method can declare no exception\n");
        }

        @Override
        void methodB() throws ArithmeticException {
            super.methodB();
            System.out.println("Overridden method can declare unchecked exception");
            System.out.println("Overridden method can't declare checked exception\n");
        }

        @Override
        void methodC() throws RuntimeException {
            super.methodC();
            System.out.println("Overridden method can declare same exception or no exception");
            System.out.println("Overridden method can't declare parent exception\n");
        }
    }
}
