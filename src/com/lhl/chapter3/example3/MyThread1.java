package com.lhl.chapter3.example3;

/**
 * Created by lunhengle on 2016/6/5.
 */
public class MyThread1 extends Thread {
    private Object lock;
    public MyThread1(Object lock){
        super();
        this.lock=lock;
    }
    @Override
    public void run(){
        synchronized (lock){
            System.out.println("开始 wait time="+System.currentTimeMillis());
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("结束 wait time="+System.currentTimeMillis());
        }
    }
}
