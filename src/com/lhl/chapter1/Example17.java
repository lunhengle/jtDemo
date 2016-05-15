package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/15.
 */
public class Example17 {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("是否停止1？ =" + Thread.interrupted());
        System.out.println("是否停止？ =" + Thread.interrupted());
    }
}
