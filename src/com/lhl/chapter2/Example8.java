package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 * 同步不能继承，所以还得在子类的方法中添加synchronized 关键字
 */
public class Example8 {
    public static void main(String[] args) {
        Sub1 sub1 = new Sub1();
        MyThread10 myThread10 = new MyThread10(sub1);
        myThread10.setName("A");
        myThread10.start();
        MyThread11 myThread11 = new MyThread11(sub1);
        myThread11.setName("B");
        myThread11.start();
    }
}
