package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class MyThread24 extends Thread {
    private int i=0;
    @Override
    public void run(){
        while (true){
            i++;
            System.out.println("i="+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
