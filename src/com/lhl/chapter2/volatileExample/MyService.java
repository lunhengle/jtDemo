package com.lhl.chapter2.volatileExample;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by lunhengle on 2016/6/5.
 * 原子类在具有逻辑性的情况下输出结果也具有随机性。
 */
public class MyService {
    public static AtomicLong aiRef = new AtomicLong();

    synchronized public void addNum() {
        System.out.println(Thread.currentThread().getName() + "加了100之后的值是：" + aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }
}
