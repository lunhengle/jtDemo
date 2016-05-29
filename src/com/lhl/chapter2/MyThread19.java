package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class MyThread19 extends Thread {
    private ObjectService1 service1;

    public MyThread19(ObjectService1 service1) {
        this.service1 = service1;
    }

    @Override
    public void run() {
        super.run();
        service1.serviceMethodB();
    }

}
