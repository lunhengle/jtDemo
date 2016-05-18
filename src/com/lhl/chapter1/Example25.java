package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/18.
 */
public class Example25 {
    public static void main(String[] args) {
        SynchronizedObject object = new SynchronizedObject();
        MyThread12 myThread12 = new MyThread12(object);
        myThread12.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread12.stop();
        System.out.println(object.getUsername() + " " + object.getPassword());
    }
}
