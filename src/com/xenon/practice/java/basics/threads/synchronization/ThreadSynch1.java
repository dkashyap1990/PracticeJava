package com.xenon.practice.java.basics.threads.synchronization;

class MyThread {

    public synchronized void run(String name, int min, int max) {
        try {
            System.out.println("Thread " + name + " is started");
            for (int i = min; i < max; i++) {
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

class Runner extends Thread {
    MyThread myThread;
    private int min, max;

    Runner(MyThread thread, int min, int max) {
        this.myThread = thread;
        this.min = min;
        this.max = max;
    }

    @Override
    public void run() {
        myThread.run(this.getName(), min, max);
    }
}


public class ThreadSynch1 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        Runner runner1 = new Runner(thread, 10, 20);
        Runner runner2 = new Runner(thread, 50, 70);

        runner1.start();
        runner2.start();

    }
}
