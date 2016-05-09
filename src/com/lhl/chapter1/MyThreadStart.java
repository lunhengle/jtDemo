package com.lhl.chapter1;

/**
 * Created by 伦恒乐 on 2016/5/7.
 *
 */
public class MyThreadStart extends Thread {
    private int i;

    public MyThreadStart() {

    }

    public MyThreadStart(int i) {
        super();
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
