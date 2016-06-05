package com.lhl.chapter2.volatileExample;

/**
 * Created by lunhengle on 2016/6/5.
 */
public class Run1 {
    public static void main(String []arags){
        RunThread runThread =new RunThread();
        runThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        runThread.setRunning(false);
        System.out.println("已经赋值为false");
    }
}
