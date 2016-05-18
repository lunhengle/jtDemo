package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/18.
 * stop 方法已经作废，如果强制让线程停止则有可能使一些请理性工作得不到完成。另外一个情况就是
 * 对锁定对象进行了“解锁”，导致数据得不到同步的处理，出现数据不一致的问题。
 */
public class Example24 {
    public static void main(String[] args) {
        MyThread11 myThread11 = new MyThread11();
        myThread11.start();
    }
}
