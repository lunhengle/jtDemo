package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/30.
 * 同步块中的代码是同步打印的，当前线程的“执行”与“退出”是成对出现的。
 * 但线程A和线程B的执行却是异步的，这就有可能出现脏读的环境。由于线程执行方法的顺序不确定，
 * 所以当A和B两个线程执行带有分支判断的方法是，就会出现逻辑上的错误，有可能出现脏读。
 */
public class Example16 {
    public static void main(String[] args) {
        MyList list = new MyList();
        MyThread26 myThread26 = new MyThread26(list);
        myThread26.setName("A");
        myThread26.start();
        MyThread27 myThread27 = new MyThread27(list);
        myThread27.setName("B");
        myThread27.start();
    }
}
