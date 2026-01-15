package com.coder.employee;

import java.time.LocalDate;

public class Staff {
    private String name;
    private int age;
    private String gender;
    private String number;
    private LocalDate hireDate;
    private int salary;
    private String location;

    public Staff() {}

    public Staff(String number, String name, String gender,int age, String hireDate, int salary, String location) {
        this.number = number;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.hireDate = LocalDate.parse(hireDate);
        this.salary = salary;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", number='" + number + '\'' +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                '}';
    }
}
