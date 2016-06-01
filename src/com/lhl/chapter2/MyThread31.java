package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/31.
 */
public class MyThread31 extends Thread {
    private Service4 service4;
    private MyObject1 myObject1;

    public MyThread31(Service4 service4, MyObject1 myObject1) {
        super();
        this.service4 = service4;
        this.myObject1 = myObject1;
    }

    @Override
    public void run() {
        super.run();
        service4.testMethod1(myObject1);
    }
}
