package com.coder.sum;

public class Sum {
    static class SumCalculator implements Runnable{
        private int a;
        private int b;
        private long sum;

        public SumCalculator(int a, int b) {
            this.a = a;
            this.b = b;
            this.sum = 0;
        }
        @Override
        public void run() {
            for(int i = a; i <= b; i++){
                sum += i;
            }
            System.out.println(Thread.currentThread().getName() + ": " + sum);
        }
        public long getSum(){
            return sum;
        }
    }
    public static void main(String[] args) throws InterruptedException {
        SumCalculator sumCalculator = new SumCalculator(1, 500);
        SumCalculator sumCalculator2 = new SumCalculator(501, 1000);
        Thread t1 = new Thread(sumCalculator);
        Thread t2 = new Thread(sumCalculator2);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        long sum = sumCalculator.getSum()+sumCalculator2.getSum();
        System.out.println(sum);
    }
}
