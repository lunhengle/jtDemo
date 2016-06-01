package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/31.
 * 当多个线程同时执行synchronized(x){}同步代码块时呈同步效果。
 */
public class Example18 {
    public static void main(String[] args) {
        Service4 service4 = new Service4();
        MyObject1 myObject1 = new MyObject1();
        MyThread30 myThread30 = new MyThread30(service4, myObject1);
        myThread30.setName("a");
        myThread30.start();
        MyThread31 myThread31 = new MyThread31(service4, myObject1);
        myThread31.setName("b");
        myThread31.start();
    }
}
