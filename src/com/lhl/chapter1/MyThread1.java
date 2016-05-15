package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/15.
 */
public class MyThread1 extends Thread {
    private int i = 5;

    @Override
    public void run() {
        System.out.println("i= " + (i--) + " threadName=" + Thread.currentThread().getName());
    }

}
