package com.coder.Admin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Handler implements InvocationHandler {
    private Object target;

    public Handler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //权限校验
        Scanner scanner=new Scanner(System.in);
        System.out.println("请录入帐户和密码:");
        String name=scanner.next();
        String pwd=scanner.next();
        User user=new User(name,pwd);
        UserLoginCheck check=new UserLoginCheck();
        boolean b = check.login(user);
        if (b) {
            Object result = method.invoke(target, args);
            //写日志
            boolean annotationPresent = method.isAnnotationPresent(Log.class);
            if (annotationPresent){
                Log annotation = method.getAnnotation(Log.class);
                String path=annotation.path();
                File file=new File(path,"log.log");
                BufferedWriter bw=new BufferedWriter(new FileWriter(file,true));
                bw.write("当前访问用户:"+user.getName());
                bw.newLine();
                bw.write("当前系统时间:"+
                        LocalDateTime.now().
                                format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
                bw.newLine();
                bw.write("当前访问类名:"+target.getClass().getName());
                bw.newLine();
                bw.write("当前访问方法:"+method.getName());
                bw.newLine();
                bw.close();
            }
            return result;
        }else{
            System.out.println("登录失败");
        }
        return null;
    }

}