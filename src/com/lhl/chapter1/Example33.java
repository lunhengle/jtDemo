package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/29.
 * 优先级高的运行的快.
 */
public class Example33 {
    public static void main(String[] args) throws InterruptedException {
        MyThread22 myThread22 = new MyThread22();
        myThread22.setPriority(Thread.NORM_PRIORITY);
        myThread22.start();
        MyThread23 myThread23 = new MyThread23();
        myThread23.setPriority(Thread.NORM_PRIORITY + 3);
        myThread23.start();
        Thread.sleep(2000);
        myThread22.stop();
        myThread23.stop();
        System.out.println("myThread22=" + myThread22.getCount());
        System.out.println("myThread23=" + myThread23.getCount());
    }
}
