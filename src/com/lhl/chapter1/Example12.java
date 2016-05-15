package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/15.
 * 验证 isAlive
 */
public class Example12 {
    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        Thread t1 = new Thread(c);
        System.out.println("Main begin t1 isAlive = " + t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 is Alive = " + t1.isAlive());
    }
}
