package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class ObjectService {
    public void serviceMethod() {
        synchronized (this) {
            System.out.println("begin time =" + System.currentTimeMillis());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end time =" + System.currentTimeMillis());
        }
    }
}
