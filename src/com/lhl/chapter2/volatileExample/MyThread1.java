package com.lhl.chapter2.volatileExample;

/**
 * Created by lunhengle on 2016/6/5.
 */
public class MyThread1 extends Thread {
    private MyService myService;

    public MyThread1(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.addNum();
    }
}
