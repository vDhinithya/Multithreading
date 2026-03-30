package com.multithreading;

public class MyThread extends Thread{


    @Override
    public void run() {
        while (true){
            System.out.println("Understanding deamon method");  // user thread, this is user thread who do the actual work
        }
    }

    public static void main(String[] args)  {
        MyThread myThread = new MyThread();
        myThread.setDaemon(true);
        myThread.start();
        System.out.println("Main thread ending its working");

        /* how it worked,
                the main thread stated, then execution goes to the myThread, there it was set to daemon
                since it was set to daemon, JVM thinks this it background process so it is not necesary to complete its execution and hence the execution stopped here
        * */
    }
}

// start run sleep join setPriority interrupt yield daemon( threads which run in background)