package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/30.
 */
public class Service3 {
    private String anyString = new String();

    public void a() {
        synchronized (anyString) {
            System.out.println("a begin");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("a end");
        }
    }

    synchronized public void b() {
        System.out.println("b begin");
        System.out.println("b end");
    }
}
