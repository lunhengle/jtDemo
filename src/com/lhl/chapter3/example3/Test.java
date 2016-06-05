package com.lhl.chapter3.example3;

/**
 * Created by lunhengle on 2016/6/5.
 */
public class Test {
    public static void main(String[] args) {
        Object lock = new Object();
        MyThread1 t1 = new MyThread1(lock);
        t1.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MyThread2 t2 = new MyThread2(lock);
        t2.start();
    }
}
