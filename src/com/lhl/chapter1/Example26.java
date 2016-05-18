package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/18.
 */
public class Example26 {
    public static void main(String[] args) throws InterruptedException {
        MyThread13 myThread13 = new MyThread13();
        myThread13.start();
        Thread.sleep(20000);
        myThread13.interrupt();
    }
}
