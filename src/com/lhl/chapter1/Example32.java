package com.lhl.chapter1;

/**
 * Created by lunhengle on 2016/5/29.
 * 不要把线程优先级与运行结果的顺序 作为衡量的标准，优先级较高的线程并不一定每次都先执行完run()方法中的人物，也就是说，线程优先级与打印顺序呢无关。
 * 不要讲两者的关系相关联，它们的关系具有不确定性和随机性。
 */
public class Example32 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread20 myThread20 = new MyThread20();
            myThread20.setPriority(5);
            myThread20.start();
            MyThread21 myThread21 = new MyThread21();
            myThread21.setPriority(6);
            myThread21.start();
        }
    }
}
