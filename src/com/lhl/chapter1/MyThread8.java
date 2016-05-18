package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/18.
 */
public class MyThread8 extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin");
            Thread.sleep(20000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("在沉睡中被停止！进入catch " + this.isInterrupted());
            e.printStackTrace();
        }
    }
}
