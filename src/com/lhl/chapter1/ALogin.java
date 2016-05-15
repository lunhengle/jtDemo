package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/15.
 */
public class ALogin extends Thread {
    @Override
    public void run(){
        LoginServlet.doPost("a","aa");
    }
}
