package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/15.
 * getId 取得线程的唯一标识
 */
public class Example15 {
    public static void main(String[] args) {
        Thread runThread = Thread.currentThread();
        System.out.println(runThread.getName() + " " + runThread.getId());
    }
}
