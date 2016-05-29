package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class MyThread20 extends Thread {
    private Task2 task2;

    public MyThread20(Task2 task2) {
        super();
        this.task2 = task2;
    }

    @Override
    public void run() {
        super.run();
        task2.doLongTimeTask();
    }
}
