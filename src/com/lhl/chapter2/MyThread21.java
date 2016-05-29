package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class MyThread21 extends Thread {
    private Task2 task2;

    public MyThread21(Task2 task2) {
        super();
        this.task2 = task2;
    }

    @Override
    public void run() {
        super.run();
        this.task2.otherMethod();
    }
}
