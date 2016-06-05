package com.lhl.chapter2.volatileExample;

/**
 * Created by lunhengle on 2016/6/5.
 */
public class Run {
    public static void main(String[] args) {
        PrintString printStringService = new PrintString();
        new Thread(printStringService).start();
        System.out.println("我要停止它！stopThread = " + Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }
}
