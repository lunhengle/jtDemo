package com.lhl.chapter2.volatileExample;

/**
 * Created by lunhengle on 2016/6/5.
 */
public class Run2 {
    public static void main(String[] args) {
        MyThread[] myThreads = new MyThread[100];
        for (int i = 0; i < 100; i++) {
            myThreads[i] = new MyThread();
        }
        for (int i = 0; i < 100; i++) {
            myThreads[i].start();
        }
    }
}
