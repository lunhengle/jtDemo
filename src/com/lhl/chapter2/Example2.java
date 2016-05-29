package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class Example2 {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
        MyThread1 myThread1 = new MyThread1(numRef1);
        myThread1.start();
        MyThread2 myThread2 = new MyThread2(numRef2);
        myThread2.start();

    }
}
