package com.coder.employee;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Information.showStaff();
        FinanceDept financeDept=new FinanceDept();
        List<Staff> list=Information.getList();

        int a=FinanceDept.sum(list,"C");
        System.out.println("研发部门工资总额："+a);
        double b=FinanceDept.average(list,"C");
        System.out.println("研发部门工资平均："+b);
        int c=FinanceDept.sum(list,"T");
        System.out.println("测试部门工资总额："+c);
        double d=FinanceDept.average(list,"T");
        System.out.println("测试部门工资平均："+d);

        PersonnelDept personnelDept=new PersonnelDept();
        personnelDept.dismiss(list,"上海市");
        System.out.println("解雇上海办公地点");
        Information.showStaff();
        personnelDept.addSalary(list,70);
        System.out.println("工作时间超过70个月上调百分之十工资");
        Information.showStaff();
    }
}
