package com.lhl.chapter3.example4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lunhengle on 2016/6/5.
 */
public class MyList {
    private static List list = new ArrayList<>();

    public static void add() {
        list.add("anyString");
    }

    public static int size() {
        return list.size();
    }
}
