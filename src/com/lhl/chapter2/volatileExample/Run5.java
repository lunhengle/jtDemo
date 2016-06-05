package com.lhl.chapter2.volatileExample;

/**
 * Created by lunhengle on 2016/6/5.
 */
public class Run5 {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ThreadB threadB = new ThreadB(service);
        threadB.start();
        System.out.println("已经发起停止的命令了!");
    }
}
