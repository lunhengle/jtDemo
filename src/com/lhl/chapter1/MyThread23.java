package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class MyThread23 extends Thread {
    private int count = 0;

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
