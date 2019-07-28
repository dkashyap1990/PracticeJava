package com.xenon.practice.java.code.exceptions;

import java.io.IOException;

public class Exception4 {

    public static void main(String[] args) throws Exception {
        System.out.println("Exception propagation ------ ");
        new Exception4().new CheckedException().c();
        new Exception4().new UncheckedException().c();
    }

    class CheckedException {

        CheckedException() {
            System.out.println("Checked exception can be propagated with throws");
        }

        void a() throws IOException {
            System.out.println("Inside A method");
            throw new IOException();
        }

        void b() throws IOException {
            System.out.println("Inside B method");
            a();
        }

        void c() {
            try {
                System.out.println("Inside C method");
                b();
            } catch (IOException e) {
                System.out.println("Catching Checked exception in C()");
            }
        }
    }

    class UncheckedException {
        UncheckedException() {
            System.out.println("Unchecked exception can be propagated without throws");
        }

        void a() {
            System.out.println("Inside A method");
            int c = 10 / 0;
        }

        void b() throws IOException {
            System.out.println("Inside B method");
            a();
        }

        void c() throws IOException {
            try {
                System.out.println("Inside C method");
                b();
            } catch (ArithmeticException e) {
                System.out.println("Catching UnChecked exception in C()");
            }
        }
    }
}
