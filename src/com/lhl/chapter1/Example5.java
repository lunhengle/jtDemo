package com.lhl.chapter1;

/**
 * Created by lenovo on 2016/5/7.
 * Runnable 接口 和 Thread 类 的区别 是java 支持单继承 多接口实现
 */
public class Example5 {
    public static void main(String args[]) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束！");
    }
}
