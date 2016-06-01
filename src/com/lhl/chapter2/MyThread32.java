package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/31.
 */
public class MyThread32 extends Thread {
    private Service5 service5;
    private MyObject3 myObject3;

    public MyThread32(Service5 service5, MyObject3 myObject3) {
        super();
        this.service5 = service5;
        this.myObject3 = myObject3;
    }

    @Override
    public void run() {
        super.run();
        service5.testMethod1(myObject3);
    }
}
