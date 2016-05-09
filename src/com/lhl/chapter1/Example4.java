package com.lhl.chapter1;

/**
 * Created by lenovo on 2016/5/7.
 * 线程执行的顺序 并不是start 方法执行的顺序
 */
public class Example4 {
    public static void main(String[] args) {
        MyThreadStart e1 = new MyThreadStart(1);
        MyThreadStart e2 = new MyThreadStart(2);
        MyThreadStart e3 = new MyThreadStart(3);
        MyThreadStart e4 = new MyThreadStart(4);
        MyThreadStart e5 = new MyThreadStart(5);
        MyThreadStart e6 = new MyThreadStart(6);
        MyThreadStart e7 = new MyThreadStart(7);
        e1.start();
        e2.start();
        e3.start();
        e4.start();
        e5.start();
        e6.start();
        e7.start();
    }

}
