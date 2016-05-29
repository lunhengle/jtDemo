package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class HasSelfPrivateNum {
    private int num = 0;

    synchronized public void addI(String username) {
        if (username.equals("a")) {
            num = 100;
            System.out.println("a set over");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } else {
            num = 200;
            System.out.println("b set over!");
        }
        System.out.println(username + " num=" + num);
    }
}
