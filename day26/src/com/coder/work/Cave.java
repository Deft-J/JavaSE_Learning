package com.coder.work;

import java.util.concurrent.TimeUnit;

public class Cave {
    public static void main(String[] args) {
        PassCave cave=new PassCave();
        new Thread(cave::pass,"A").start();
        new Thread(cave::pass,"B").start();
        new Thread(cave::pass,"C").start();
    }
}

class PassCave{
    public synchronized void pass(){
        System.out.println(Thread.currentThread().getName()+"进入山洞");
        try {
            TimeUnit.SECONDS.sleep(5);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"走出山洞");
    }
}
