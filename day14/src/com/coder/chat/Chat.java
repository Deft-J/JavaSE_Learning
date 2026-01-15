package com.coder.chat;

import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {
        System.out.println("输入聊天内容：");
        Scanner sc = new Scanner(System.in);
        String[] x={"敏感文字"};
        String y=sc.nextLine();
        for (String c : x){
            y=y.replace(c,replace(c));
        }
        System.out.println("输出为："+y);
    }

    public static  String replace(String str){
        StringBuffer s = new StringBuffer();
        for(int i=0;i<str.length();i++){
            s.append("*");
        }
        return s.toString();
    }


}

