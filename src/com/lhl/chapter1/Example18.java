package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/15.
 */
public class Example18 {
    public static void main(String[] args) {
        MyThread6 myThread6 = new MyThread6();
        myThread6.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread6.interrupt();
        System.out.println("是否停止1？" + myThread6.isInterrupted());
        System.out.println("是否停止2？" + myThread6.isInterrupted());
    }
}
