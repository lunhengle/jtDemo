package com.lhl.chapter3.example4;

/**
 * Created by lunhengle on 2016/6/5.
 */
public class Run {
    public static void main(String[] args){
        Object lock =new Object();
        ThreadA a=new ThreadA(lock);
        a.start();
        try {
            ThreadB.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ThreadB b=new ThreadB(lock);
        b.start();
    }
}
