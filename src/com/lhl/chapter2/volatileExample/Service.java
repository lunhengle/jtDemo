package com.lhl.chapter2.volatileExample;

/**
 * Created by lunhengle on 2016/6/5.
 * 关键字synchronized可以是多个线程访问同一个资源具有同步性，而且它还具有将线程工作内存中的
 * 私有变量与公共内存中的变量同步的功能。
 * 关键字synchronized可以保证在同一时刻，只有一个线程可以执行某一个方法或某一个代码块。它包含两个特征；
 * 互斥性和可见性。同步synchronized不仅可以解决一个线程看到对象处于不一致的状态，还可以保证进入方法
 * 或者同步代码块的每个线程，都看到由同一个锁保护之前所有的修改效果。
 * 学习多线程并发，要着重“外练互斥，内修可见”
 */
public class Service {
    private boolean isContinueRun = true;

    public void runMethod() {
        String anyString =new String();
        while (isContinueRun == true) {
            synchronized (anyString){}
        }
        System.out.println("停下来了！");
    }

    public void stopMethod() {
        isContinueRun = false;
    }
}
