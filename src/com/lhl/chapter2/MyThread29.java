package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/30.
 */
public class MyThread29 extends Thread {
    private MyOneList list;

    public MyThread29(MyOneList list) {
        this.list = list;
    }

    @Override
    public void run() {
        MyService myService = new MyService();
        myService.addServiceMethod(list, "B");
    }
}
