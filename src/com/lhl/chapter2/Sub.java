package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class Sub extends Main {
    synchronized public void operateISubMethod() {
        while (i > 0) {
            i--;
            System.out.println("sub print i = " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.operateIMainMethod();
        }
    }

}
