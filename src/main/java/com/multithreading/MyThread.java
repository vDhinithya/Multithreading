package com.multithreading;

public class MyThread extends Thread{
//    @Override
//    public void run() {
//
//
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//
//        System.out.println("Thread is running ...");
//
//    }

    public MyThread (String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            String a = "";
            for (int j = 0; j < 10000; j++) {
                a += "a";
            }
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count:" + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {

            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread l = new MyThread("Low Priority");
        MyThread m = new MyThread("Mid priority");
        MyThread h = new MyThread("High Priority");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();
        
    }
}

// start run sleep join setPriority