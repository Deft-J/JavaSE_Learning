package com.coder.Test;
import java.util.concurrent.locks.LockSupport;

public class Shop {
    private static Thread orderThread;
    private static Thread payThread;
    private static Thread pointsThread;
    private static final int total = 3;

    public static void main(String[] args) {
        orderThread = new Thread(() -> {
            for (int i = 0; i < total; i++) {
                if (i > 0) {
                    LockSupport.park();
                }
                System.out.println("第" + (i + 1) + "次 : 购买商品下单");
                LockSupport.unpark(payThread);
            }
        }, "下单线程");

        payThread = new Thread(() -> {
            for (int i = 0; i < total; i++) {
                LockSupport.park();
                System.out.println("第" + (i + 1) + "次 : 使用微信付款");
                LockSupport.unpark(pointsThread);
            }
        }, "付款线程");

        pointsThread = new Thread(() -> {
            for (int i = 0; i < total; i++) {
                LockSupport.park();
                System.out.println("第" + (i + 1) + "次 : 个人帐户积分");
                LockSupport.unpark(orderThread);
            }
        }, "积分线程");

        orderThread.start();
        payThread.start();
        pointsThread.start();
    }
}

