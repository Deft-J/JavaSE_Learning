package com.coder.digit;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数字(用逗号隔开): ");
        String digit = sc.nextLine();
        String[] num=digit.split(",");
        for (String i:num){
            BigDecimal decimal=new BigDecimal(i);
            BigDecimal s = decimal.multiply(new BigDecimal(10)).divide(new BigDecimal(1), 2, RoundingMode.HALF_UP);
            System.out.println(s);
        }
    }
}
