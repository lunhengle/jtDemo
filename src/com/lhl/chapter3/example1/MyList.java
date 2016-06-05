package com.lhl.chapter3.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lunhengle on 2016/6/5.
 */
public class MyList {
    private List list = new ArrayList();

    public void add() {
        list.add("伦恒乐");
    }

    public int size() {
        return list.size();
    }
}
