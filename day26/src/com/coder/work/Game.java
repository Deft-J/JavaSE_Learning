package com.coder.work;

public class Game {
    static final Object lock = new Object();

    public static void main(String[] args) {
        Thread t = new Thread(()->{
            synchronized (lock) {
                    try{
                        lock.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                System.out.println(Thread.currentThread().getName()+"攻击防御塔");
            }
        },"攻击防御塔线程");
        Thread s=new Thread(()->{
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName()+"产生超级兵");
                lock.notify();
            }
        },"产生超级兵线程");
        t.start();
        s.start();
    }
}
