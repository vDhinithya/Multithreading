package com.multithreading;

public class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(MyThread.currentThread().getName() + " is running");
            Thread.yield(); // this says hint to give chance to the other tthread too
        }
    }

    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread("1st thread");
        MyThread t2 = new MyThread("2nnd thread");

        t1.start();
        t2.start();
    }
}

// start run sleep join setPriority interrupt