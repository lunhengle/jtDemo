package com.lhl.chapter3.example7;

/**
 * Created by lunhengle on 2016/6/5.
 */
public class Test {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a.interrupt();
    }
}
