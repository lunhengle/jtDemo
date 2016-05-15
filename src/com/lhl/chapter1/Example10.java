package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/15.
 */
public class Example10 {
    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        Thread t1 = new Thread(c);
        t1.setName("A");
        t1.start();
    }
}
