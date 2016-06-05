package com.lhl.chapter3.example5;

/**
 * Created by lunhengle on 2016/6/5.
 * 当方法wait()被执行后，锁被自动释放，但执行完notify()方法，锁却不自动释放。
 */
public class Test {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        ThreadB b = new ThreadB(lock);
        b.start();
    }
}
