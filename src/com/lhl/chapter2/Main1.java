package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class Main1 {
    synchronized public void serviceMethod() {
        System.out.println("int main 下一步sleep begin threadName = " + Thread.currentThread() + System.currentTimeMillis());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("int main 下一步sleep end threadName =" + Thread.currentThread() + System.currentTimeMillis());
    }
}
