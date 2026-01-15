package com.coder.staff;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Staff> list=Data.getStaffList();
        Dept dept=new Dept();
        dept.overSalary(list);
        dept.checkMan(list);
        dept.getSalaryHireDate(list);
        dept.maxSalary(list);
        dept.cout(list);
        dept.minAge(list);
        dept.getLetter(list,"研发部");
    }
}
