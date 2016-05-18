package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/18.
 * 在使用 suspend 和resume 方法是，如果使用方法不当，
 * 极易造成公共的同步对象的独占，使得其他线程无法访问公共同步对象。
 */
public class SynchronizedObject1 {
    synchronized public void printString() {
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("a 线程永远 suspend 了！");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}
