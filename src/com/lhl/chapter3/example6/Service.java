package com.lhl.chapter3.example6;

/**
 * Created by lunhengle on 2016/6/5.
 */
public class Service {
    public void testMethod(Object lock) {
        synchronized (lock) {
            System.out.println("begin wait() " + Thread.currentThread().getName());
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" end wait() " + Thread.currentThread().getName());
        }
    }

    public void synNotifyMethod(Object lock) {
        synchronized (lock) {
            System.out.println("begin notify() ThreadName= " + Thread.currentThread().getName() + System.currentTimeMillis());
            lock.notify();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" end notify() ThreadName=" + Thread.currentThread().getName() + System.currentTimeMillis());
        }
    }
}
