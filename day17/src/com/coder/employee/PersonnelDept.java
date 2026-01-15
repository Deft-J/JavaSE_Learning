package com.coder.employee;

import java.util.Iterator;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.List;

public class PersonnelDept {
    public void dismiss(List<Staff>list,String location){
        for(Iterator<Staff> iterator=list.iterator();iterator.hasNext();){
            Staff staff=iterator.next();
            if(staff.getLocation().equals(location)){
                iterator.remove();
            }
        }
    }
    public void addSalary(List<Staff>list,long month){
        for(Iterator<Staff> iterator=list.iterator();iterator.hasNext();){
            Staff staff=iterator.next();
            long workMonth=ChronoUnit.MONTHS.between(staff.getHireDate(),LocalDate.now());
            if (workMonth>=month){
                staff.setSalary((int)(staff.getSalary()*1.1));
            }
        }
    }
}
