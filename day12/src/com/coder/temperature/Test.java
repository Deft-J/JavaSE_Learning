package com.coder.temperature;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入摄氏温度：");
        double t1=0;
        try{
            t1 = sc.nextDouble();
        }catch(InputMismatchException e){
            System.out.println("摄氏温度输入错误");
            e.printStackTrace();
            return;
        }
        double t2=t1*1.8+32;
        System.out.println("华氏温度："+t2);
    }

}


