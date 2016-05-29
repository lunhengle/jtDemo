package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class Example11 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        MyThread16 myThread16 = new MyThread16(task1);
        myThread16.start();
        MyThread17 myThread17 = new MyThread17(task1);
        myThread17.start();
    }
}
