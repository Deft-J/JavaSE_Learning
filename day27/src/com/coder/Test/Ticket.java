package com.coder.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ticket {
    private static volatile int count = 10;
    private static final ExecutorService executor = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            final int id = i + 1;
            executor.submit(() -> {
                bookTicket("旅客" + id);
            });
        }
        executor.shutdown();
    }

    private static void bookTicket(String passengerName) {
        synchronized (Ticket.class) {
            if (count > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                count--;
                System.out.println(passengerName + "已成功买票，还剩" + count + "张");
            } else {
                System.out.println(passengerName + "抢票失败，票已售罄");
            }
        }
    }
}
