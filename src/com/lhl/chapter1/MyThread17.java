package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class MyThread17 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2 run priority =" + this.getPriority());
    }
}
