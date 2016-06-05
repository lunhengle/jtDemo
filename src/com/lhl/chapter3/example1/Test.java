package com.lhl.chapter3.example1;

/**
 * Created by lunhengle on 2016/6/5.
 */
public class Test {
    public static void main(String[] args) {
        MyList service = new MyList();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.start();
    }
}
