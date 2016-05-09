package com.lhl.chapter1;

/**
 * Created by lenovo on 2016/5/7.
 */
public class MyNotShareThread extends Thread {
    private int count = 5;

    public MyNotShareThread(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println("由" + this.currentThread().getName() + "计算，count=" + count);
        }
    }
}
