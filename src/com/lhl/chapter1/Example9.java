package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/15.
 */
public class Example9 {
    public static void main(String[] args) {
        MyThread1 run = new MyThread1();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);
        Thread t4 = new Thread(run);
        Thread t5 = new Thread(run);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
