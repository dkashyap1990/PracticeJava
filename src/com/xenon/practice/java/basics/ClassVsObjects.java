package com.xenon.practice.java.basics;

class ClassDemo {
    ClassDemo() {
        System.out.println("Inside Class contructor");
    }

    void showMe() {
        System.out.println("Inside class method");
    }
}

public class ClassVsObjects {
    public static void main(String[] args) {
        System.out.println("Inside Main method");

        ClassDemo demo = new ClassDemo();
        demo.showMe();
    }
}
