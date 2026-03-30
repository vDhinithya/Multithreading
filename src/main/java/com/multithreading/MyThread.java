package com.multithreading;

public class MyThread extends Thread{

    private Counter counter;

    public MyThread (Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

// start run sleep join setPriority interrupt yield daemon( threads which run in background)