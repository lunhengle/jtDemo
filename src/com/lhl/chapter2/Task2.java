package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class Task2 {
    synchronized public void otherMethod() {
        System.out.println("----------------run---otherMethod");
    }

    synchronized public void doLongTimeTask() {
        synchronized (this) {
            for (int i = 0; i < 10000; i++) {
                System.out.println("synchronized threadName=" + Thread.currentThread().getName() + "i=" + (i + 1));
            }
        }
    }
}
