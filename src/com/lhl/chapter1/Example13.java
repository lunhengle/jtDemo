package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/15.
 */
public class Example13 {
    public static void main(String[] args) {
        MyThread4 myThread4 = new MyThread4();
        System.out.println("begin =" + System.currentTimeMillis());
        myThread4.run();
        System.out.println("end =" + System.currentTimeMillis());
    }
}
