package com.coder.user;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Register {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入用户名");
        String name=sc.nextLine();
        boolean b=exists(name,"d:/users");
        if (b){
            System.out.println("用户注册失败");
        }else{
            System.out.println("输入密码：");
            String password=sc.nextLine();
            Users users=new Users();
            users.setName(name);
            users.setPassword(password);
            File dir=new File("d:/users");
            File file=new File(dir,name);
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(users);
            oos.close();
        }
    }

    public static boolean exists(String name,String dir){
        File dirFile=new File(dir);
        dirFile.mkdirs();
        File[] files=dirFile.listFiles();
        if (files!=null){
            for (File file : files) {
                String fileName=file.getName();
                if (name.equals(fileName)) {
                    return true;
                }
            }
        }
        return false;
    }
}
