package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/15.
 */
public class MyThread7 extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 2000000; i++) {
                if (interrupted()) {
                    System.out.println("已经是停状态，我要退出了！");
                    throw new InterruptedException();
                }
                System.out.println("i=" + (i + 1));
            }
            System.out.println("我被输出，线程并未停止！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
