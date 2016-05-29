package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 * 关键字 synchronized 拥有锁冲入的功能，也就是在使用synchronized时，当一个线程得到一个对象锁后，
 * 再次请求此对象锁时是可以再次得到该对象的锁的。
 * “可重入锁”的概念是：自己可以再次获取自己的内部锁。
 */
public class Example5 {
    public static void main(String[] args) {
        MyThread6 myThread6 = new MyThread6();
        myThread6.start();
    }
}
