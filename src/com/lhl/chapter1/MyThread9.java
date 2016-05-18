package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/18.
 */
public class MyThread9 extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10000; i++) {
            System.out.println("i= " + (i + 1));
        }
        System.out.println("run begin");
        try {
            Thread.sleep(200000);
        } catch (InterruptedException e) {
            System.out.println("线停止,再遇到了 sleep! 进入catch");
            e.printStackTrace();
        }
    }
}
