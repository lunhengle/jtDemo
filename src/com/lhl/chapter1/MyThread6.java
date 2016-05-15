package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/15.
 */
public class MyThread6 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100; i++) {
            System.out.println("i=" + (i + 1));
        }
    }
}
