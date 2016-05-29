package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class Example9 {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread12 myThread12 = new MyThread12(task);
        myThread12.start();
        MyThread13 myThread13 = new MyThread13(task);
        myThread13.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long beginTime = CommonUtils.beginTime1;
        if (CommonUtils.beginTime2 < CommonUtils.beginTime1) {
            beginTime = CommonUtils.beginTime2;
        }
        long endTime = CommonUtils.endTime1;
        if (CommonUtils.endTime2 > CommonUtils.endTime1) {
            endTime = CommonUtils.endTime2;
        }
        System.out.println("耗时：" + (endTime - beginTime) / 1000);
    }
}
