package com.coder.staff;

import java.time.LocalDate;
import java.util.Objects;

public class Staff {
    private String num;
    private String name;
    private String gender;
    private int age;
    private int salary;
    private String dept;
    private LocalDate hireDate;

    public Staff(String num, String name, String gender, int age, int salary, String deptLocal,LocalDate hireDate) {
        this.num = num;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.hireDate = hireDate;
        this.dept = deptLocal;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public Staff(){

    }

    @Override
    public String toString() {
        return "Staff{" +
                "num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return age == staff.age && salary == staff.salary && Objects.equals(num, staff.num) && Objects.equals(name, staff.name) && Objects.equals(gender, staff.gender) && Objects.equals(dept, staff.dept) && Objects.equals(hireDate, staff.hireDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, name, gender, age, salary, dept, hireDate);
    }
}
