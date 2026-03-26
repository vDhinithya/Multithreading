package com.multithreading;
/*
*  when execution of program starts, its thread also starts (main thread)
   to create a new Thread in java, it can be done by either extend Thread class or implement Runnable interface
* */
public class Test {
    public static void main(String[] args) {
        System.out.println("Hello there ");
        System.out.println(Thread.currentThread().getName());

        // creating the object of thread class
        World world = new World();
        // world.start();      // this is a thread which is used with "extend thread"
        Thread t1 = new Thread(world);
        t1.start();            // while implementing the Runnable interface

        for (int i = 0; i < 500; i++) {
            System.out.println(Thread.currentThread().getName());  /*this in main thread*/
            // execution of both threads will be in random order

        }
    }
}
