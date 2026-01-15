package com.coder.staff;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Dept {
    public void  overSalary(List<Staff> staffList){
        boolean a=staffList.stream().filter(s->s.getDept().equals("产品部"))
                .allMatch(s->s.getSalary()>10000);
        if (a){
            System.out.println("产品部所有员工工资超过10000");
        }else {
            System.out.println("产品部不是所有员工工资超过10000");
        }
    }
    public void checkMan(List<Staff> staffList){
        boolean b=staffList.stream().filter(s->s.getDept().equals("研发部"))
                .allMatch(s->s.getGender().equals("男"));
        if (b){
            System.out.println("研发部所有员工为男性");
        }else {
            System.out.println("研发部不是所有员工为男性");
        }
    }
    public void getSalaryHireDate(List<Staff> staffList){
        System.out.println("所有研发部工资超过10000元，入职5年(含)以上的员工为：");
        staffList.stream().filter(s->s.getDept().equals("研发部"))
                .filter(s->s.getSalary()>10000).filter(s-> ChronoUnit.YEARS.between(s.getHireDate(), LocalDate.now())>=5)
                .forEach(System.out::println);
    }
    public void cout(List<Staff> staffList){
        long count=staffList.stream().filter(s->!s.getDept().equals("项目部")).count();
        System.out.println("不是项目部员工人数为:"+count);
    }
    public void maxSalary(List<Staff> staffList){
        Optional<Staff> max=staffList.stream().filter(s->ChronoUnit.YEARS.between(s.getHireDate(),LocalDate.now())>=5)
                .max(Comparator.comparingInt(Staff::getSalary));
        System.out.println("五年以上员工最高工资为："+max.get().getSalary());
    }
    public void minAge(List<Staff> staffList){
        Optional<Staff>min=staffList.stream().filter(s->s.getDept().equals("研发部"))
                .min(Comparator.comparingInt(Staff::getAge));
        System.out.println("研发部年龄最小员工："+min.get());
    }
    public void getLetter(List<Staff> staffList,String deptName){
        Optional<Staff> staff=staffList.stream().filter(s->s.getDept().equals(deptName))
                .findAny();
        String num=staff.get().getNum();
        System.out.println("该部门编号首字母为："+num.charAt(0));
    }
}

