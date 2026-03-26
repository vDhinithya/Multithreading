package com.multithreading;

// this is one way "public class World extends Thread {"
public class World implements Runnable{

    @Override
    public void run() {
        /*super.run();*/
        for (int i = 0; i < 348; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
