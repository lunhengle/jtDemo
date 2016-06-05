package com.lhl.chapter3.example2;

/**
 * Created by lunhengle on 2016/6/5.
 */
public class Test1 {
    public static void main(String[] args){
        String lock=new String();
        System.out.println("syn上面");
        try {
            synchronized (lock){
                System.out.println("syn第一行");
                lock.wait();
                System.out.println("wait下的代码！");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("syn下面的代码");
    }
}
