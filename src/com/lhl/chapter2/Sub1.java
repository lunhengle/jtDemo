package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 * 同步不能继承，所以还得在子类的方法中添加synchronized 关键字
 */
public class Sub1 extends Main1 {
    @Override
    synchronized public void serviceMethod() {
        System.out.println("int sub 下一步sleep begin threadName = " + Thread.currentThread() + System.currentTimeMillis());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("int sub 下一步sleep end threadName=" + Thread.currentThread() + System.currentTimeMillis());
        super.serviceMethod();
    }
}
