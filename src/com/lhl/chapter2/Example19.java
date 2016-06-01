package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/31.
 */
public class Example19 {
    public static void main(String[] args) {
        Service4 service4 = new Service4();
        MyObject1 myObject1 = new MyObject1();
        MyObject1 myObject2 = new MyObject1();
        MyThread30 myThread30 = new MyThread30(service4, myObject1);
        myThread30.setName("A");
        myThread30.start();
        MyThread31 myThread31 = new MyThread31(service4, myObject2);
        myThread31.setName("B");
        myThread31.start();
    }
}
