package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/15.
 */
public class MyThread5 extends Thread {
    @Override
    public void run() {
        System.out.println("run threadName=" + this.currentThread().getName() + "begin = " + System.currentTimeMillis());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("run threadName=" + this.currentThread().getName() + "end =" + System.currentTimeMillis());
    }
}
