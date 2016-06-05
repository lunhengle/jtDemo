package com.lhl.chapter3.example1;

/**
 * Created by lunhengle on 2016/6/5.
 */
public class ThreadA extends Thread{
    private MyList list;
    public ThreadA(MyList list){
        super();
        this.list =list;
    }
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            try {
                list.add();
                System.out.println("添加了"+(i+1)+"个元素");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
