package com.xenon.practice.java.code.functional;

@FunctionalInterface
interface Interface {
    static void showStatic() {
        System.out.println("Inside static method");
    }

    void showNormal();

    default void showDefault() {
        System.out.println("Inside default method");
    }
}

public class MethodsInInterface {
    public static void main(String[] args) {
        Interface inf = () ->
                System.out.println("Inside normal method");

        inf.showDefault();
        inf.showNormal();
        Interface.showStatic();
    }
}
