package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class MyThread14 extends Thread {
    private ObjectService service;

    public MyThread14(ObjectService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethod();
    }
}
