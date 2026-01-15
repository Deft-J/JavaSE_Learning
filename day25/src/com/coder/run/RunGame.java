package com.coder.run;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RunGame {
    public static void main(String[] args) throws InterruptedException {
        RunThread r1 = new RunThread(1, 3);
        RunThread r2 = new RunThread(3, 5);
        Thread t1 = new Thread(r1, "乌龟");
        Thread t2 = new Thread(r2, "兔子");
        Thread[] threads = {t1, t2};

        r1.setThreads(threads);
        r2.setThreads(threads);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("最终赢家是：" + RunThread.winner);
    }
}

class RunThread implements Runnable {
    private int min;
    private int max;
    static String winner;
    private Random rand;
    private boolean isRest;
    private Thread[] threads;

    public RunThread(int min, int max) {
        this.min = min;
        this.max = max;
        rand = new Random();
        isRest = false;
    }

    public Thread[] getThreads() {
        return threads;
    }

    public void setThreads(Thread[] threads) {
        this.threads = threads;
    }

    @Override
    public void run() {
        int length = 0;
        while (true) {
            if (Thread.currentThread().isInterrupted()) {
                break;
            }
            int step = rand.nextInt(max - min + 1) + min;
            length += step;
            String name = Thread.currentThread().getName();

            if (name.equals("兔子") && length >= 70 && !isRest) {
                try {
                    System.out.println("兔子已跑" + length + "米，开始休息...");
                    isRest = true;
                    TimeUnit.MILLISECONDS.sleep(1);
                } catch (InterruptedException e) {
                    System.out.println("兔子休息被打扰了！");
                    break;
                }
            }

            System.out.println(name + "跑到了" + length + "米");

            if (length >= 100) {
                System.out.println(name + "到达终点！");
                winner = name;
                for (Thread thread : threads) {
                    if (thread != Thread.currentThread()) {
                        thread.interrupt();
                    }
                }
                break;
            }
        }
    }
}
