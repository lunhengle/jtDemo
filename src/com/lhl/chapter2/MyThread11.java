package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class MyThread11 extends Thread {
    private Sub1 sub1;

    public MyThread11(Sub1 sub1) {
        super();
        this.sub1 = sub1;
    }

    @Override
    public void run() {
        sub1.serviceMethod();
    }
}
