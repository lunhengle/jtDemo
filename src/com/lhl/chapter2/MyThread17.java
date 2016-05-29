package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class MyThread17 extends Thread {
    private Task1 task1;

    public MyThread17(Task1 task1) {
        this.task1 = task1;
    }

    @Override
    public void run() {
        super.run();
        task1.doLongTimeTask();
    }
}
