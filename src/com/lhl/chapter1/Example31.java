package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class Example31 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread18 myThread18 = new MyThread18();
            myThread18.setPriority(10);
            myThread18.start();
            MyThread19 myThread19 = new MyThread19();
            myThread19.setPriority(1);
            myThread19.start();
        }
    }
}
