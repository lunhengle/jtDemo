package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class Example1 {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();
        MyThread1 myThread1 = new MyThread1(numRef);
        myThread1.start();
        MyThread2 myThread2 = new MyThread2(numRef);
        myThread2.start();

    }
}
