package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/18.
 */
public class Example27 {
    public static void main(String[] args) {

        try {
            MyThread14 myThread14 = new MyThread14();
            myThread14.start();
            Thread.sleep(5000);
            //A段
            myThread14.suspend();
            System.out.println("A = " + System.currentTimeMillis() + " i=" + myThread14.getI());

            Thread.sleep(5000);
            System.out.println("A = " + System.currentTimeMillis() + " i=" + myThread14.getI());
            //B段
            myThread14.resume();
            Thread.sleep(5000);
            //C段
            myThread14.suspend();
            System.out.println("B = " + System.currentTimeMillis() + " i=" + myThread14.getI());
            Thread.sleep(5000);
            System.out.println("B = " + System.currentTimeMillis() + " i=" + myThread14.getI());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
