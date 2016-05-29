package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class Example13 {
    public static void main(String[] args){
        Task2 task2 =new Task2();
        MyThread20 myThread20 =new MyThread20(task2);
        myThread20.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MyThread21 myThread21=new MyThread21(task2);
        myThread21.start();
    }
}
