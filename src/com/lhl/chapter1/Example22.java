package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/18.
 */
public class Example22 {
    public static void main(String[] args) {
        MyThread9 myThread9 = new MyThread9();
        myThread9.start();
        myThread9.interrupt();
        System.out.println("end!");
    }
}
