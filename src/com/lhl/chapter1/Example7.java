package com.lhl.chapter1;

/**
 * Created by 伦恒乐 on 2016/5/7.
 * 线程共享数据例子
 */
public class Example7 {
    public static void main(String[] args) {
        MyShareThread m1 = new MyShareThread();
        Thread t1 = new Thread(m1, "A");
        Thread t2 = new Thread(m1, "B");
        Thread t3 = new Thread(m1, "C");
        t1.start();
        t2.start();
        t3.start();
    }
}
