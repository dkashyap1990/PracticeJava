package com.xenon.practice.java.basics.threads;

public class Thread1 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        try {
            System.out.println("Thread " + t.getName() + " is started");
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread " + t.getName() + " is running .... " + i);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread exception interrupted");
        } finally {
            System.out.println("Thread " + t.getName() + " is completed");
        }
    }
}
