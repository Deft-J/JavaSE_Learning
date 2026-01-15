package com.coder.lambda;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class EvenNumber {
    public static void main(String[] args) {
        System.out.println("随机生成10个100以内整数：");
        Supplier<Integer> supplier=()->new Random().nextInt(100);
        List<Integer> list=createNum(10,supplier);
        list.forEach(System.out::println);
        System.out.println("其中偶数为：");
        Predicate<Integer> predicate=i->i%2==0;
        List<Integer> newList=filterNum(list,predicate);
        newList.forEach(System.out::println);
    }
    public static List<Integer> createNum(int x,Supplier<Integer> supplier){
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < x; i++) {
            list.add(supplier.get());
        }
        return list;
    }
    public static List<Integer> filterNum(List<Integer> list,Predicate<Integer> predicate){
        List<Integer> list2=new ArrayList<>();
        for (Integer i : list) {
            boolean b=predicate.test(i);
            if(b){
                list2.add(i);
            }
        }
        return list2;
    }
}
