package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class MyThread12 extends Thread {
    private Task task;

    public MyThread12(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime1 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime1 = System.currentTimeMillis();
    }
}
