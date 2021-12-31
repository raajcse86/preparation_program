package com.codility;

import java.util.ArrayList;
import java.util.List;

public class NullCheck {
    public static void main(String[] args) {
        NullCheck l2 = new NullCheck();
        List<String> l = new ArrayList<>();
        l.add("a");
        l.add("b");
        System.out.println(l.size());
        l2.m1(l);
//        l=null;
        System.out.println(l.size());
    }


    public void m1(List<String> l){
        l.add("c");
        l = null;
    }

}
