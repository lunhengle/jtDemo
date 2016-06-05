package com.lhl.chapter3.example6;

/**
 * Created by lunhengle on 2016/6/5.
 * 必须执行完notify()方法所在的同步synchronized代码块后才释放锁。
 */
public class Test {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA a = new ThreadA(lock);
        a.start();
        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();
        SynNotifyMethodThread c = new SynNotifyMethodThread(lock);
        c.start();
    }
}
