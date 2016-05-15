package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/15.
 */
public class Example20 {
    public static void main(String[] args) {
        MyThread7 thread = new MyThread7();
        thread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
        System.out.println("end!");
    }
}
