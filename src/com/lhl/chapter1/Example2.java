package com.lhl.chapter1;

/**
 * Created by lenovo on 2016/5/7.
 * 在运用多线程编程时 代码的运行结果与代码执行顺序或调用顺序是无关的。
 */
public class Example2 extends Thread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("运行结束!");
    }
}
