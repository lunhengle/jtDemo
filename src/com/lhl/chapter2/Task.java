package com.lhl.chapter2;

/**
 * Created by lunhengle on 2016/5/29.
 */
public class Task {
    private String getData1;
    private String getData2;

    public void doLongTimeTask() {
        System.out.println("begin task");
        String privateGetData1 = "长时间处理任务后从远程返回的值1 threadName=" + Thread.currentThread().getName();
        String privateGetData2 = "长时间处理任务后从远程返回的值2 threadName=" + Thread.currentThread().getName();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this) {
            getData1 = privateGetData1;
            getData2 = privateGetData2;
        }
        System.out.println(getData1);
        System.out.println(getData2);
        System.out.println("end task");
    }
}
