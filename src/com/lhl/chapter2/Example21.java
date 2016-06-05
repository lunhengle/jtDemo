package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/6/1.
 */
public class Example21 {
    public static void main(String[] args) {
        MyThread34 myThread34 = new MyThread34();
        myThread34.setName("A");
        myThread34.start();
        MyThread35 myThread35 = new MyThread35();
        myThread35.setName("B");
        myThread35.start();
    }

}
