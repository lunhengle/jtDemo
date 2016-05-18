package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/18.
 */
public class MyThread14 extends Thread {
    private long i = 0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true) {
            i++;
        }
    }
}
