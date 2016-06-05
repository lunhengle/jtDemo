package com.lhl.chapter3.example5;

/**
 * Created by lunhengle on 2016/6/5.
 */
public class Service {
    public void testMethod(Object lock){
        synchronized (lock){
            System.out.println("begin wait()");
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end wait()");
        }
    }
}
