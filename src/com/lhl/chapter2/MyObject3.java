package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/31.
 */
public class MyObject3 {
    public void speedPrintString() {
        synchronized (this){
            System.out.println("speedPrintString____getLock time=" + System.currentTimeMillis()
                    + "me=" + Thread.currentThread().getName());
            System.out.println("----------------------------");
            System.out.println("speedPrintString releaseLock time=" + System.currentTimeMillis()
                    + "me=" + Thread.currentThread().getName());
        }
    }
}
