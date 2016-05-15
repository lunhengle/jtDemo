package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/15.
 * 非线程安全的例子
 */
public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;

    synchronized public static void doPost(String username, String password) {
        usernameRef = username;
        if (username.equals("a")) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        passwordRef = password;
        System.out.println("username=" + usernameRef + " password=" + password);
    }
}
