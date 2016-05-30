package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/30.
 */
public class MyThread25 extends Thread {
    private Service3 service3;

    public MyThread25(Service3 service3) {
        this.service3 = service3;
    }

    @Override
    public void run() {
        service3.b();
    }
}
