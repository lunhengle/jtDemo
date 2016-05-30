package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/30.
 * 同步代码块放在非同步synchroinzed方法中进行声明，并不能保证调用方法的线程的执行同步/顺序性，
 * 也就是线程调用方法的顺序是无序的虽然在同步块中执行的顺序是同步，这样极易出现“脏读”问题。
 */
public class Example15 {
    public static void main(String[] args) {
        Service3 service3 = new Service3();
        MyThread24 myThread24 = new MyThread24(service3);
        myThread24.setName("A");
        myThread24.start();
        MyThread25 myThread25 = new MyThread25(service3);
        myThread25.setName("B");
        myThread25.start();
    }
}
