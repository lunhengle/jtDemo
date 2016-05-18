package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/18.
 */
public class Example29 {
    public static void main(String[] args) {
        MyThread15 myThread15 = new MyThread15();
        myThread15.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread15.suspend();
        System.out.println("main end!");
    }
}
