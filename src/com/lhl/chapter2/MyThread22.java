package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/30.
 */
public class MyThread22 extends Thread {
    private Service2 service2;

    public MyThread22(Service2 service2) {
        super();
        this.service2 = service2;
    }

    @Override
    public void run() {
        service2.setUsernamePassword("a", "aa");
    }
}
