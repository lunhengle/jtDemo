package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class MyThread16 extends Thread {
    private Task1 task1;

    public MyThread16(Task1 task1) {
        super();
        this.task1 = task1;
    }

    @Override
    public void run() {
        super.run();
        task1.doLongTimeTask();
    }
}
