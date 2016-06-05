package com.lhl.chapter3.example1;

/**
 * Created by lunhengle on 2016/6/5.
 */
public class ThreadB extends Thread {
    private MyList list;

    public ThreadB(MyList list) {
        super();
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            if (list.size() == 5) {
                System.out.println("==5了，线程出了！");
                try {
                    throw new InterruptedException();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
