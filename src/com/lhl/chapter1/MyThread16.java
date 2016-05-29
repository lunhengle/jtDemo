package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class MyThread16 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread1 run priority=" + this.getPriority());
        MyThread17 myThread17 = new MyThread17();
        myThread17.start();
    }
}
