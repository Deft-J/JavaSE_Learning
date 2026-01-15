package com.coder.Test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Game {
    static final ReentrantLock lock = new ReentrantLock();
    static boolean b=false;
    static Condition condition = lock.newCondition();

    public static void main(String[] args) throws InterruptedException {
        Thread t1= new Thread(()->{
            try{
                lock.lock();
                while(!b){
                    try{
                        condition.await();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("攻击防御塔");
            }finally {
                lock.unlock();
            }
        });
        TimeUnit.SECONDS.sleep(1);
        Thread t2= new Thread(()->{
            try{
                lock.lock();
                System.out.println("生产超级兵");
                b=true;
                condition.signal();
            }finally {
                lock.unlock();
            }
        });
        t1.start();
        t2.start();
    }
}
