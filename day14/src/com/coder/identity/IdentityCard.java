package com.coder.identity;

import java.util.Scanner;


public class IdentityCard {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入身份证号码：");
        String idCard=scanner.next();
        if (validate(idCard)){
            String n = number(idCard);
            System.out.println("身份证号码:"+n+" "+gender(idCard));
        }else{
            System.out.println("身份证输入错误");
        }
    }
    public static boolean validate(String idCard){
        String r="\\d{17}[\\d{1}X]";
        return idCard.matches(r);
    }
    public static String number(String id){
        StringBuffer buffer=new StringBuffer(id);
        buffer.replace(6,14,"********");
        return buffer.toString();
    }
    public static String gender(String id){
        char x=id.charAt(id.length()-2);
        int y=Integer.parseInt(String.valueOf(x));
        return y%2==0?"女士":"先生";
    }
}
