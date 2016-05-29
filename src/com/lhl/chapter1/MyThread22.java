package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class MyThread22 extends Thread {
    private int count = 20;

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        while (true) {
            count++;
        }
    }

}
