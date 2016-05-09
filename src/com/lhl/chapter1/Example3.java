package com.lhl.chapter1;

/**
 * Created by lenovo on 2016/5/7.
 * 这个例子证明多线程调用的随机性
 */
public class Example3 extends Thread {
    public static void main(String[] args) {
        MyForThread myForThread = new MyForThread();
        myForThread.setName("myThread");
        myForThread.start();
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
