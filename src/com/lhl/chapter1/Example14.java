package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/15.
 * 验证sleep
 */
public class Example14 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        System.out.println("begin =" + System.currentTimeMillis());
        myThread5.start();
        System.out.println("end =" + System.currentTimeMillis());
    }
}
