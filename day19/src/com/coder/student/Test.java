package com.coder.student;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> list = DataBase.getList();
        double c = Count.sum(list, "语文");
        System.out.println(c);
        double a=Count.avg(list,"语文");
        System.out.println(a);
        int i =Count.countNoPass(list);
        System.out.println(i);
        Count.add10(list);
        Count.print(list);
    }
    }
