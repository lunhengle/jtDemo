package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class Main {
    public int i=10;
    synchronized public void operateIMainMethod(){
        i--;
        System.out.println("main print i="+i);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
