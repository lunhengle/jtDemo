package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/30.
 */
public class Example14 {
    public static void main(String[] args) {
        Service2 service2 = new Service2();
        MyThread22 myThread22 = new MyThread22(service2);
        myThread22.setName("A");
        myThread22.start();
        MyThread23 myThread23 = new MyThread23(service2);
        myThread23.setName("B");
        myThread23.start();
    }
}
