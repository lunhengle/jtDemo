package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/15.
 */
public class Example19 {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        thread.interrupt();
        System.out.println("是否停止1？" + thread.isInterrupted());
        System.out.println("是否停止2？" + thread.isInterrupted());
    }
}
