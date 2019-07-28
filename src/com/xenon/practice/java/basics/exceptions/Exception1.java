package com.xenon.practice.java.basics.exceptions;

public class Exception1 {
    public static void main(String[] args) {
        System.out.println("Normal exception handling with catch and finally");
        try {
            int a = 10;
            int b = 0;
            System.out.println(a + "/" + b + "=" + a / b);
        } catch (ArithmeticException e) {
            System.out.println("Exception : " + e.getMessage());
        } finally {
            System.out.println("Inside finally block");
        }

        System.out.println("Rest of the code");
    }
}
