package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/30.
 * 使用“synchronized(非this对象x)同步代码块”格式化进行同步操作时，
 * 对象监视器必须是同一个对象。如果不是同一个对象监视器，运行的结果就是异步调用了，就会交叉运行。
 */
public class Service2 {
    private String usernameParam;
    private String passwordParam;


    public void setUsernamePassword(String username, String password) {
        String anyString = new String();
        synchronized (anyString) {
            System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入代码块");
            usernameParam = username;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            passwordParam = password;
            System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开同步块");

        }
    }
}
