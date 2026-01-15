package com.coder.work;

import java.util.concurrent.TimeUnit;

public class Student {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Thread studentThread=new Thread(s1,"学生");
        Teacher1 t1 = new Teacher1(studentThread);
        Thread teacherThread=new Thread(t1,"老师");
        studentThread.start();
        teacherThread.start();
    }
}

class Student1 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始睡觉");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + "被吵醒");
        }
        System.out.println(Thread.currentThread().getName() + "开始上课");
    }
}
class Teacher1 implements Runnable {
    private Thread thread;
    public Teacher1(Thread thread) {
        this.thread = thread;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"进入教室上课");
        for (int i = 0; i < 3; i++) {
            System.out.println("上课");
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        thread.interrupt();
    }
}
