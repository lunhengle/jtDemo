package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 * 出现异常的锁被自动释放。
 */
public class Example7 {
    public static void main(String[] args) {
        Service1 service1 = new Service1();
        MyThread8 myThread8 = new MyThread8(service1);
        myThread8.setName("a");
        myThread8.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MyThread9 myThread9 = new MyThread9(service1);
        myThread9.setName("b");
        myThread9.start();

    }
}
