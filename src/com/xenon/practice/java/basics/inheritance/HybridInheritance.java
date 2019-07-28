package com.xenon.practice.java.basics.inheritance;

public class HybridInheritance {
    public static void main(String[] args) {
        Implementer implementer = new HybridInheritance().new Implementer();
        implementer.showA();
        implementer.showB();
        implementer.showC();
        implementer.showD();
        implementer.showE();
    }

    interface C {
        void showC();
    }

    interface D extends C {
        void showD();
    }

    interface E {
        void showE();
    }

    class A {
        void showA() {
            System.out.println("Inside A method");
        }
    }

    class B extends A {
        void showB() {
            System.out.println("Inside B method");
        }
    }

    class Implementer extends B implements D, E {
        @Override
        public void showC() {
            System.out.println("Inside C method");
        }

        @Override
        public void showD() {
            System.out.println("Inside D method");
        }

        @Override
        public void showE() {
            System.out.println("Inside E method");
        }
    }
}
