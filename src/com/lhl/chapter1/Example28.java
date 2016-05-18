package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/18.
 */
public class Example28 {
    public static void main(String[] args) {
        final SynchronizedObject1 object1 = new SynchronizedObject1();
        try {
            Thread thread1 = new Thread() {
                @Override
                public void run() {
                    object1.printString();
                }
            };
            thread1.setName("a");
            thread1.start();

            thread1.sleep(10000);

            Thread thread2 = new Thread() {
                @Override
                public void run() {
                    System.out.println("thread2启动了，但进入不了printString() 方法被 a 线程锁定并且永远suspend暂停了！");
                    object1.printString();
                }
            };
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
