package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class MyThread5 extends Thread {
    private PublicVar publicVar;

    public MyThread5(PublicVar publicVar) {
        super();
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValue("B", "BB");
    }
}
