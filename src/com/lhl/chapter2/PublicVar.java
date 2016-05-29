package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class PublicVar {
    public String username = "A";
    public String password = "AA";

    synchronized public void setValue(String username, String password) {
        this.username = username;
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.password = password;
        System.out.println("setValue method thread name = " + Thread.currentThread().getName() + " username = " + username + " password = " + password);
    }

    synchronized public void getValue() {
        System.out.println("getValue method thread name = " + Thread.currentThread().getName() + " username = " + username + " password = " + password);
    }
}
