package com.coder.admin;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("输入用户账号：");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        boolean a = Register.userName(username) ;
        if (!a){
            System.out.println("用户账号不符合要求");
            return;
        }
        System.out.println("输入用户密码：");
        String pwd= sc.nextLine();
        boolean b=Register.userPwd(pwd);
        if (!b){
            System.out.println("用户密码不符合要求");
            return;
        }
        System.out.println("用户注册成功");
    }
}
