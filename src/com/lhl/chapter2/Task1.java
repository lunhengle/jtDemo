package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class Task1 {
    public void doLongTimeTask() {
        for (int i = 0; i < 100; i++) {
            System.out.println("nosynchronized threadName = " + Thread.currentThread());
        }
        System.out.println("");
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                System.out.println("synchronized threadName = " + Thread.currentThread().getName() + " i=" + (i + 1));
            }
        }
    }
}
