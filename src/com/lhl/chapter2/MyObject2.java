package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/31.
 */
public class MyObject2 {
    synchronized public void speedPrintString() {
        System.out.println("speedPrintString____getLock time=" + System.currentTimeMillis()
                + "me=" + Thread.currentThread().getName());
        System.out.println("----------------------------");
        System.out.println("speedPrintString releaseLock time=" + System.currentTimeMillis()
                + "me=" + Thread.currentThread().getName());
    }
}
