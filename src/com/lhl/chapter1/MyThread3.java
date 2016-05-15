package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/15.
 */
public class MyThread3 extends Thread {
    @Override
    public void run() {
        System.out.println("run = " + this.isAlive());
    }
}
