package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/30.
 */
public class Example17 {
    public static void main(String[] args) throws InterruptedException {
        MyOneList list = new MyOneList();
        MyThread28 myThread28 = new MyThread28(list);
        myThread28.setName("A");
        myThread28.start();

        MyThread29 myThread29 = new MyThread29(list);
        myThread29.setName("B");
        myThread29.start();
        Thread.sleep(6000);
        System.out.println("listSize = " + list.getSize());
    }
}
