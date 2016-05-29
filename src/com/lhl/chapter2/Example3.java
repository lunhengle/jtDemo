package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class Example3 {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        MyThread3 myThread3 = new MyThread3(object);
        myThread3.setName("A");
        MyThread4 myThread4 = new MyThread4(object);
        myThread4.setName("B");
        myThread3.start();
        myThread4.start();
    }
}
