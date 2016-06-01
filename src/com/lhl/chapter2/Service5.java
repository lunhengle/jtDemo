package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/31.
 */
public class Service5 {
    public void testMethod1(MyObject3 myObject3) {
        synchronized (myObject3) {
            System.out.println("testMethod1_____getLock time=" + System.currentTimeMillis()
                    + "run ThreadName=" + Thread.currentThread().getName());
            try {
                Thread.sleep(50000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("testMethod1 releaseLock time=" + Thread.currentThread().getName());
        }
    }
}
