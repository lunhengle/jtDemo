package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/30.
 */
public class MyThread27 extends Thread {
    private MyList list;

    public MyThread27(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            list.add("myThread27" + (i + 1));
        }
    }
}
