package com.lhl.chapter1;

import java.util.Random;

/**
 * Created by lunhengle on 2016/5/29.
 * 线程优先级.
 */
public class MyThread19 extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        long addResult = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 50000; i++) {
                Random random = new Random();
                random.nextInt();
                addResult = addResult + i;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("****thread2 user time = " + (endTime - beginTime));
    }
}
