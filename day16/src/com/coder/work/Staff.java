package com.coder.work;

import java.time.LocalDate;

public class Staff {
    private String name;
    private LocalDate hireDate;
    private int salary;
    private int workMonth;

    public Staff() {}
    public Staff(String name, LocalDate hireDate, int salary) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
        setWorkMonth(Date.betweenMonth(hireDate));
    }



    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                ", workMonth=" + workMonth +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public int getWorkMonth() {
        return workMonth;
    }

    public void setWorkMonth(int workMonth) {
        this.workMonth = workMonth;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
