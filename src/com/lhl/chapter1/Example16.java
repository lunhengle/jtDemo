package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/15.
 * 停止线程的三种方法
 * 1.使用退出标志，使线程正常退出，也就是当run方法完成后线程终止
 * 2.使用stop方法强行终止线程，不推荐使用这种方法 ，因为stop和suspend及resume一样，都是作废过期的方法，使用它们可能产生不可预料的结果
 * 3.使用interrupt 方法终止线程
 */
public class Example16 {
    public static void main(String[] args) {
        MyThread6 myThread6 = new MyThread6();
        myThread6.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread6.interrupt();
        System.out.println("是否停止1？=" + myThread6.interrupted());
        System.out.println("是否停止2？=" + myThread6.interrupted());
    }
}
