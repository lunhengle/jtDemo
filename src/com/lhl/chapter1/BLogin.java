package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/15.
 */
public class BLogin extends Thread {
    @Override
    public void run() {
        LoginServlet.doPost("b", "bb");
    }
}
