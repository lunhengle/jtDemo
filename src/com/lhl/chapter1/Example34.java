package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class Example34 {
    public static void main(String[] args) throws InterruptedException {
        MyThread24 myThread24=new MyThread24();
        myThread24.setDaemon(true);
        myThread24.start();
        Thread.sleep(5000);
        System.out.println("我要离开thread对象也不再打印了，也就是停止了！");
    }
}
