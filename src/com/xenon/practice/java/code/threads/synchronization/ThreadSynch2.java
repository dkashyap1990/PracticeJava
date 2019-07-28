package com.xenon.practice.java.code.threads.synchronization;

class MyThread1 {
    void run(String name, int min, int max) {
        try {
            System.out.println("Thread " + name + " is started");
            for (int i = min; i < max - 20; i++) {
                System.out.println("Thread " + name + " is running .... " + i);
                Thread.sleep(10);
            }

            synchronized (this) {
                System.out.println("Synchronization started for thread " + name);
                for (int i = max - 20; i < max - 10; i++) {
                    System.out.println("Thread " + name + " is running .... " + i);
                    Thread.sleep(10);
                }
                System.out.println("Synchronization completed for thread " + name);
            }

            for (int i = max - 10; i < max; i++) {
                System.out.println("Thread " + name + " is running .... " + i);
                Thread.sleep(10);
            }

        } catch (InterruptedException e) {
            System.out.println("Thread exception interrupted");
        } finally {
            System.out.println("Thread " + name + " is completed");
        }
    }
}

class Runner1 extends Thread {
    private MyThread1 myThread;
    private int min, max;

    Runner1(MyThread1 thread, int min, int max) {
        this.myThread = thread;
        this.min = min;
        this.max = max;
    }

    @Override
    public void run() {
        myThread.run(this.getName(), min, max);
    }
}


public class ThreadSynch2 {
    public static void main(String[] args) {
        MyThread1 thread = new MyThread1();
        Runner1 runner1 = new Runner1(thread, 10, 30);
        Runner1 runner2 = new Runner1(thread, 40, 70);

        runner1.start();
        runner2.start();
    }
}
