package com.multithreading;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("RUNNING STATE");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());  // in java RUNNABLE used to show either the thread is ready to run or currently running
        System.out.println(Thread.currentThread().getState()); // it should show running but java treat running and runnable same
        Thread.sleep(100); // pausing the main thread so that the other thread can run
        System.out.println(t1.getState());
        t1.join();  // main method will wait for t1 to finish
        System.out.println(t1.getState());
    }
}
