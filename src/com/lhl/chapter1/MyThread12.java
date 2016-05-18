package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/18.
 */
public class MyThread12 extends Thread {
    private SynchronizedObject object;

    public MyThread12(SynchronizedObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        object.printString("b", "bb");
    }

}
