package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 * 当存在父子继承关系是，子类是完全可以通过“可冲入锁” 调用父类的同步方法的。
 */
public class Example6 {
    public static void main(String[] args) {
        MyThread7 myThread7 = new MyThread7();
        myThread7.start();
    }
}
