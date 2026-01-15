package com.coder.work;

public class Enterprise {
    public void addSalary(Staff[] Staff){
        for(Staff staff : Staff){
            if (staff.getWorkMonth()>=100){
                staff.setSalary(staff.getSalary()+10000);
            }
        }
    }
    public void showStaff(Staff[] Staff){
        for(Staff staff : Staff){
            System.out.println(staff);
        }
    }

}
