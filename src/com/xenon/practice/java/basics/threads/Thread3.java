package com.xenon.practice.java.basics.threads;

public class Thread3 {
    public static void main(String[] args) {
        Thread3 t = new Thread3();
        Thread t1 = t.new MyThread("-1-");
        Thread t2 = t.new MyThread("-2-");
        Thread t3 = t.new MyThread("-3-");
        Thread t4 = t.new MyThread("-4-");

        try {
            System.out.println("Thread " + t1.getName() + " is active : " + t1.isAlive());
            System.out.println("Thread " + t2.getName() + " is active : " + t2.isAlive());
            System.out.println("Thread " + t3.getName() + " is active : " + t3.isAlive());
            System.out.println("Thread " + t4.getName() + " is active : " + t4.isAlive());

            System.out.println("Thread joining started..");
            t1.start();
            t1.join(50);
            t2.start();
            t2.join(20);
            t3.start();
            t4.start();

            System.out.println("Thread " + t1.getName() + " is active : " + t1.isAlive());
            System.out.println("Thread " + t2.getName() + " is active : " + t2.isAlive());
            System.out.println("Thread " + t3.getName() + " is active : " + t3.isAlive());
            System.out.println("Thread " + t4.getName() + " is active : " + t4.isAlive());

        } catch (Exception e) {
            System.out.println("Thread interrupted...");
        }

    }

    class MyThread extends Thread {
        MyThread(String name) {
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
