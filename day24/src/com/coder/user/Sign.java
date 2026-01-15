package com.coder.user;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Sign {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
    login();
    }

    public static Users login() throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入用户名");
        String name=sc.nextLine();
        boolean b=Register.exists(name,"d:/users");
        if (!b){
            System.out.println("用户不存在");
        }else{
            File userFile = new File("d:/users", name);
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(userFile));
            Users users=(Users)ois.readObject();
            System.out.println("输入密码：");
            String password=sc.nextLine();
            if (password.equals(users.getPassword())){
                System.out.println("登陆成功");
                ois.close();
                return users;
            }else{
                System.out.println("密码错误");
                ois.close();
            }
        }
        return null;
    }
}