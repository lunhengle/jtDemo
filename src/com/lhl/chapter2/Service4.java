package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/31.
 */
public class Service4 {
    public void testMethod1(MyObject1 myObject1) {
        synchronized (myObject1) {
            System.out.println("testMethod1____getLock time=" + System.currentTimeMillis()
                    + "run ThreadName=" + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("testMethod1 releaseLock time=" + System.currentTimeMillis()
                    + "run ThreadName=" + Thread.currentThread().getName());
        }
    }
}
