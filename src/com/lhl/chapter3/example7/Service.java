package com.lhl.chapter3.example7;

/**
 * Created by lunhengle on 2016/6/5.
 * 1.执行完同步代码块就会释放锁。
 * 2.在执行同步代码块的过程中，遇到异常而导致线程终止，锁也会被释放。
 * 3.在执行同步代码块的过程中，执行了锁所属对象的wait()方法，这个线程会释放锁对象，而此线程对象会进入线程等待池中，
 * 等待被唤醒.
 */
public class Service {
    public void testMethod(Object lock) {
        synchronized (lock) {
            System.out.println("begin wait() ");
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("出现异常了，因为呈现wait状态的线程被interrupt了！");
            }
            System.out.println(" end wait()");
        }
    }
}
