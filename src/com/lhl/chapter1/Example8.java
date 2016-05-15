package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/15.
 * 通过添加 synchronized 关键字 控制 线程安全
 */
public class Example8 {
    public static void main(String[] args) {
        ALogin a = new ALogin();
        a.start();
        BLogin b = new BLogin();
        b.start();
    }
}
