package com.multithreading;
/*
*  when execution of program starts, its thread also starts (main thread)
   to create a new Thread in java, it can be done by either extend Thread class or implement Runnable interface

   Thread vs runnable :- while you already using inheritance, a class which extends to another class
                         the option left is implement the runnable interface
                         *
* */
public class Test {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (Exception e){

        }
        System.out.println(counter.getCount());
    // there are two threads t1 and t2 having the common resource/object COUNTER

    // while running the program, we should be expecting the counter to be 2000, as both threads will run for 1000 times and that too for same object
    // but it may or may not be because we are sharing the same object, so at the same moment both threads will update/access the same method/data
    // this can be solved using the "synchronized" keyword to that method
    }
}
