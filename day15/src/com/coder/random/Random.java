package com.coder.random;

import java.util.Timer;
import java.util.TimerTask;

public class Random {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                int i= (int) (Math.random()*1000);
                System.out.println(i);
            }
        },0,2000);
    }
}
