package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/31.
 * 当其他线程执行x对象中synchronized同步方法是呈现同步效果
 */
public class Example20 {
    public static void main(String[] args) throws InterruptedException {
        Service5 service5 = new Service5();
        MyObject3 myObject3 = new MyObject3();
        MyThread32 myThread32 = new MyThread32(service5, myObject3);
        myThread32.setName("A");
        myThread32.start();
        Thread.sleep(100);
        MyThread33 myThread33 = new MyThread33(service5, myObject3);
        myThread33.setName("B");
        myThread33.start();
    }
}
