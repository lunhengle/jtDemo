package com.lhl.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lunhengle on 2016/5/30.
 */
public class MyOneList {
    private List list = new ArrayList();

    synchronized public void add(String data) {
        list.add(data);
    }

    synchronized public int getSize() {
        return list.size();
    }
}
