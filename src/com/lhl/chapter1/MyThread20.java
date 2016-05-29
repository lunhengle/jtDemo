package com.lhl.chapter1;

import java.util.Random;

/**
 * Created by lunhengle on 2016/5/29.
 * 线程优先级
 */
public class MyThread20 extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            random.nextInt();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("****thread20 use time=" + (endTime - beginTime));
    }
}
