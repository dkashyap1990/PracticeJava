package com.xenon.practice.java.code.exceptions;

public class Exception3 {
    public static void main(String[] args) {

        System.out.println("Nested try catch with finally");
        try {
            int a = 10;
            int b = 0;

            int c = a / b;

            try {

                System.out.println("Creating array with size : " + c);
                int[] array = new int[c];

            } catch (NegativeArraySizeException e) {
                System.out.println("Error : Array size cannot be negative");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error : Cannot divide by zero");
        }
    }
}
