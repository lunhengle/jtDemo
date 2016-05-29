package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 * 同步代码块
 */
public class Example10 {
    public static void main(String[] args) {
        ObjectService service = new ObjectService();
        MyThread14 myThread14 = new MyThread14(service);
        myThread14.setName("a");
        myThread14.start();
        MyThread15 myThread15 = new MyThread15(service);
        myThread15.setName("b");
        myThread15.start();
    }
}
