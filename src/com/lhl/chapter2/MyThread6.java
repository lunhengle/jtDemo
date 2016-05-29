package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class MyThread6 extends Thread {
    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }

}
