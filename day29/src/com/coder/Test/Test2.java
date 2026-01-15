package com.coder.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        System.out.println("添加整数前的列表: " + stringList);
        try {
            Method addMethod = ArrayList.class.getMethod("add", Object.class);
            addMethod.invoke(stringList, 123);
            addMethod.invoke(stringList, 456);
            System.out.println("添加整数后的列表: " + stringList);
            for (Object obj : stringList) {
                System.out.println("元素: " + obj + ", 类型: " + obj.getClass().getSimpleName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}