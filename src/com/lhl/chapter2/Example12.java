package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class Example12 {
    public static void main(String[] args) {
        ObjectService1 service1 = new ObjectService1();
        MyThread18 myThread18 = new MyThread18(service1);
        myThread18.setName("a");
        myThread18.start();
        MyThread19 myThread19 = new MyThread19(service1);
        myThread19.setName("b");
        myThread19.start();
    }
}
