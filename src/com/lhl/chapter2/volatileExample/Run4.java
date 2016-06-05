package com.lhl.chapter2.volatileExample;

/**
 * Created by lunhengle on 2016/6/5.
 */
public class Run4 {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThread1[] myThread1s = new MyThread1[5];
        for (int i = 0; i < myThread1s.length; i++) {
            myThread1s[i] = new MyThread1(myService);
        }
        for (int i = 0; i < myThread1s.length; i++) {
            myThread1s[i].start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(myService.aiRef.get());
    }
}
