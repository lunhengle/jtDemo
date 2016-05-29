package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class MyThread9 extends Thread {
    private Service1 service;

    public MyThread9(Service1 service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
