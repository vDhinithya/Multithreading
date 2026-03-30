package com.multithreading;

public class Counter {

    private int count = 0;
// to make the method synchronized
//    public synchronized void increment(){
//        count++;
//    }

    // to make specific variable synchronized put that into synchronized block
    public void increment(){
        synchronized (this){
            count++;
        }
    }
    public int getCount(){
        return count;
    }
}
