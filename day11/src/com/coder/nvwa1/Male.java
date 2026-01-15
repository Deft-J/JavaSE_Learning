package com.coder.nvwa1;

public class Male implements Person {

    @Override
    public void eat() {
        System.out.println("男人吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("男人睡觉");
    }

    @Override
    public void talk() {
        System.out.println("男人说话");
    }
}
