package com.coder.nvwa1;

import com.sun.security.jgss.GSSUtil;

public class Female implements Person {
    @Override
    public void eat() {
        System.out.println("女人吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("女人睡觉");
    }

    @Override
    public void talk() {
        System.out.println("女人说话");
    }
}
