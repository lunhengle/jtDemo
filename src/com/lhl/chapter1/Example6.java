package com.lhl.chapter1;

/**
 * Created by 伦恒乐 on 2016/5/7.
 * 线程之间数据不共享例子
 */
public class Example6 extends Thread {
    public static void main(String[] args) {
        MyNotShareThread m1 = new MyNotShareThread("A");
        MyNotShareThread m2 = new MyNotShareThread("B");
        MyNotShareThread m3 = new MyNotShareThread("C");
        m1.start();
        m2.start();
        m3.start();
    }

}
