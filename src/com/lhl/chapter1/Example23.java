package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/18.
 */
public class Example23 {
    public static void main(String[] args) {
        MyThread10 myThread10 = new MyThread10();
        myThread10.start();
        try {
            myThread10.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread10.stop();
    }
}
