package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/15.
 * this.interrupted():测试当前线程是否已经是中段状态，执行后具有将状态标志清除为false的功能
 * this.isInterrupted():测试Thread对象是否是中断状态，但是不清除状态标志
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
