package com.xenon.practice.java.code.exceptions;

import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        System.out.println("Try block with multiple catch and single finally block");
        Scanner sc = null;
        try {
            System.out.println("Insert array length : ");
            sc = new Scanner(System.in);
            int c = sc.nextInt();

            if (c == 0) c = -1;

            int[] array = new int[c];
            for (int i = 0; i < c; i++) {
                array[i] = i;
            }

            System.out.println("Insert array position to search : ");
            int p = sc.nextInt();

            System.out.println("Array element in position " + p + " is : " + array[p - 1]);

        } catch (NegativeArraySizeException e) {
            System.out.println("Error : Array size cannot be negative or zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error : Search position is greater then array size");
        } finally {
            if (sc != null) sc.close();
            System.out.println("Closing scanner instance");
        }
    }
}
