package com.xenon.practice.java.code.inheritance;

public class MultipleInheritance {
    public static void main(String[] args) {
        Implementer impl = new MultipleInheritance().new Implementer();
        impl.showA();
        impl.showB();
    }

    interface A {
        void showA();
    }

    interface B {
        void showB();
    }

    class Implementer implements A, B {
        @Override
        public void showA() {
            System.out.println("Inside A interface method");
        }

        @Override
        public void showB() {
            System.out.println("Inside B interface method");
        }

    }
}
