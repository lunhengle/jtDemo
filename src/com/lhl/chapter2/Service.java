package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class Service {
    synchronized public void service1() {
        System.out.println("service 1");
        service2();
    }

    synchronized public void service2() {
        System.out.println("service 2");
        service3();
    }

    synchronized public void service3() {
        System.out.println("service 3");
    }
}
