package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/18.
 */
public class Example21 {
    public static void main(String[] args) {
        MyThread8 myThread8 = new MyThread8();
        myThread8.start();
        try {
            Thread.sleep(200);
            myThread8.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end !");
    }
}
