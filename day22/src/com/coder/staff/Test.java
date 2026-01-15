package com.coder.staff;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Staff> list = Data.getStaffList();

        Stream<String> d = list.stream().map(Staff::getDept).distinct();
        List<String> dept = d.collect(Collectors.toList());
        dept.forEach(System.out::println);

        Optional<Staff> min = list.stream().min(Comparator.comparing(Staff::getHireDate));
        System.out.println(min.get());

        int sum = list.stream().filter(s -> s.getDept().equals("研发部")).mapToInt(Staff::getSalary).sum();
        System.out.println(sum);
        OptionalDouble avg = list.stream().filter(s -> s.getDept().equals("研发部")).mapToInt(Staff::getSalary).average();
        System.out.println(avg.getAsDouble());

        long c = list.stream().filter(s -> s.getName().startsWith("李")).count();
        System.out.println("c = " + c);

        list.stream().sorted(Comparator.comparingInt(Staff::getAge).thenComparing(Staff::getSalary)).forEach(System.out::println);
        list.stream().sorted(Comparator.comparing(Staff::getHireDate).reversed()).forEach(System.out::println);

        Map<String, List<Staff>> collect = list.stream().collect(Collectors.groupingBy(s -> {
            if (s.getName().length() == 2) {
                return "2个字符";
            } else {
                return "3个字符";
            }
        }));
        collect.forEach((k, v) -> {
            System.out.println("字符数:" + k);
            v.forEach(System.out::println);
        });

        list.stream().filter(s -> s.getDept().equals("产品部")).filter(s -> s.getSalary() < 10000).map(s -> {
                    s.setSalary(s.getSalary() + 1000);
                    return s;
                }).forEach(System.out::println);

        list.stream().map(Staff::getNum).sorted().forEach(System.out::println);

        Object[] objects =list.stream().map(Staff::getName).toArray();
        for (Object object : objects) {
            String x = (String) object;
            System.out.println(x);
        }
        String s = list.stream().map(Staff::getName).collect(Collectors.joining(","));
        String[] strs = s.split(",");
        for (String str : strs) {
            System.out.println(str);
        }
    }
}
