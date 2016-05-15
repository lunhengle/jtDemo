package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/15.
 * 判断线程是否处于活动状态
 * 线程活动状态就是线程已经启动且尚未终止，线程处于正在运行或准备开始运行的状态，就认为线程是 存活 的
 */
public class Example11 {
    public static void main(String[] args) {
        MyThread3 myThread3 = new MyThread3();
        System.out.println("begin ==" + myThread3.isAlive());
        myThread3.start();
        System.out.println("end ==" + myThread3.isAlive());
    }
}
