package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class Example30 {
    public static void main(String[] args) {
        System.out.println("main thread begin priority=" + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main thread end priorty =" + Thread.currentThread().getPriority());
        MyThread16 myThread16 = new MyThread16();
        myThread16.start();
    }
}
