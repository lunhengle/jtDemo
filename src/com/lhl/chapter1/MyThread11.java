package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/18.
 */
public class MyThread11 extends Thread {
    @Override
    public void run() {
        try {
            this.stop();
        } catch (ThreadDeath e) {
            System.out.println("进入了catch()");
            e.printStackTrace();
        }
    }
}
