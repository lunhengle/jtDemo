package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class ObjectService1 {
    public void serviceMethodA() {
        synchronized (this) {
            System.out.println("A begin time = " + System.currentTimeMillis());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("A end time = " + System.currentTimeMillis());
        }
    }

    public void serviceMethodB() {
        synchronized (this) {
            System.out.println("B begin time = " + System.currentTimeMillis());
            System.out.println("B end time = " + System.currentTimeMillis());
        }
    }
}
