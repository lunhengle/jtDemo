package com.lhl.chapter2.volatileExample;

/**
 * Created by lunhengle on 2016/6/5.
 * 关键字volatile 提示线程每次从共享内存中读取变量，
 * 而不是从私有内存中读取，这样就保证了同步数据的可见性。
 */
public class MyThread extends Thread {
    volatile public static int count;

    synchronized private static void addCount() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("count =" + count);
    }

    @Override
    public void run() {
        addCount();
    }

}
