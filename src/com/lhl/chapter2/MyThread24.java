package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/30.
 */
public class MyThread24 extends Thread {
    private Service3 service3;

    public MyThread24(Service3 service3) {
        super();
        this.service3 = service3;
    }

    @Override
    public void run() {
        service3.a();
    }

}
