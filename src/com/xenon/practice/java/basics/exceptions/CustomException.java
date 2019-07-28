package com.xenon.practice.java.basics.exceptions;


public class CustomException {
    public static void main(String[] args) throws StackException {
        Stack stack = new CustomException().new Stack(10);
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }


        for (int i = 0; i < 11; i++) {
            stack.pop();
        }
    }

    class StackException extends Exception {
        StackException(String exp) {
            super(exp);
        }
    }

    class Stack {
        private int top;
        private int[] array;
        private int size;

        Stack(int size) throws StackException {
            this.size = size;
            if (size == 0) size = -1;
            try {
                array = new int[size];
                top = -1;
            } catch (NegativeArraySizeException e) {
                throw new StackException("Stack size can not be negative");
            }
        }

        void push(int elt) throws StackException {
            if (top == size)
                throw new StackException("Stack is overflown");


            System.out.println("Push element : " + elt);
            array[++top] = elt;
            display();
        }

        void pop() throws StackException {
            if (top == -1)
                throw new StackException("Stack is overflown");

            int elt = array[top--];
            System.out.println("Popping element : " + elt);
            display();
        }


        void display() {
            System.out.print("Stack is ::: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
