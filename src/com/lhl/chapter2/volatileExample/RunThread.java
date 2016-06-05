package com.lhl.chapter2.volatileExample;

/**
 * Created by lunhengle on 2016/6/5.
 * 通过使用volatile关键字，强制的从公共内存中读取变量的值。
 * 使用volatile关键字增加了实例变量在多个线程之间的可见性。但是volatile关键字最致命的缺点是不支持原子性。
 * 关键字synchronized和volatile比较：
 * 1.关键字volatile是线程同步的轻量级实现，所以volatile只能修饰于变量，而synchronized可以修饰方法，
 * 以及代码块。随着JDK新版本的发布，synchronized 关键字在执行效率上得到很到提升，在开发中使用
 * synchronized关键字的比率还是很大的。
 * 2.多线程访问volatile不会发生阻塞，而synchronized会出现阻塞。
 * 3.volatile能保证数据的可见性，但是不能保证原子性；而synchronized可以保证原子性，也可以间接保证可见性，
 * 因为它会将私有内存和共有内存中的数据做同步。
 * 4.关键字volatile解决的是变量在多个线程之间的可见性；而synchronized关键字解决的是多个线程之间
 * 访问资源的同步性。
 * 线程安全包含原子性和可见性两个方面，java的同步机制都是围绕这两个方面来确保线程安全的。
 */
public class RunThread extends Thread {
    volatile private boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    @Override
    public void run() {
        System.out.println("进入run了");
        while (isRunning == true) {
        }
        System.out.println("线程被停止了！");
    }
}
