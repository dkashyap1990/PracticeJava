package com.xenon.practice.java.code.threads;

public class Thread2 {
    public static void main(String[] args) {
        Thread t1 = new Thread2().new MyThread1("ONE");
        t1.start();
    }

    class MyThread1 extends Thread {

        MyThread1(String name) {
            super(name);
        }

        @Override
        public void run() {
            try {
                System.out.println("Thread " + this.getName() + " is started");
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread " + this.getName() + " is running .... " + i);
                    Thread.sleep(10);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread exception interrupted");
            } finally {
                System.out.println("Thread " + this.getName() + " is completed");
            }
        }
    }
}
