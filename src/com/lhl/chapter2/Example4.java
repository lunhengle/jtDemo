package com.lhl.chapter2;

import com.lhl.chapter1.*;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class Example4 {
    public static void main(String [] args){
        PublicVar publicVar=new PublicVar();
        MyThread5 myThread5 =new MyThread5(publicVar);
        myThread5.start();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        publicVar.getValue();
    }
}
