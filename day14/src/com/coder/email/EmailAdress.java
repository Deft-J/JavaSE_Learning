package com.coder.email;

import java.util.Arrays;
import java.util.Scanner;

public class EmailAdress {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入邮箱地址：");
        String emailAdress = in.nextLine();
        String[] emails=emailAdress.split(";");
        int a=0;
        int b=0;
        for (String email : emails) {
            if (checkEmail(email)) {
                System.out.println(email+"发送成功");
                a += 1;
                if (email.endsWith("qq.com")){
                    b+=1;
                }
            }else{
                System.out.println(email+"发送失败");
            }
        }
        System.out.println("成功发出"+a+"封邮件；其中qq邮件有"+b+"封");
    }
    public static boolean checkEmail(String email){
        int a=email.indexOf("@");
        int t=email.lastIndexOf("@");
        int dot=email.lastIndexOf(".");
        return a!=-1 && a==t && dot>a+1 && dot!=email.length()-1;
    }
}
