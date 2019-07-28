package com.xenon.practice.java.basics.inheritance;

public class HierarchicalInheritance {
    public static void main(String[] args) {
        new HierarchicalInheritance().new ChildA().show();
        new HierarchicalInheritance().new ChildB().show();
    }

    class Parent {
        Parent() {
            System.out.println("Inside parent constructor");
        }

        void show() {
            System.out.println("Inside parent method");
        }
    }

    class ChildA extends Parent {
        ChildA() {
            System.out.println("Inside Child A constructor");
        }
    }

    class ChildB extends Parent {
        ChildB() {
            System.out.println("Inside Child B constructor");
        }
    }

}
