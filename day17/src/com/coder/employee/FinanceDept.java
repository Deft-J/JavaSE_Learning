package com.coder.employee;
import java.util.List;


public class FinanceDept {
    public static int sum(List<Staff> list, String p){
        int sum=0;
        for(Staff staff:list){
            if(staff.getNumber().startsWith(p)){
                sum+=staff.getSalary();
            }
        }
        return sum;
    }
    public static double average(List<Staff> list, String p){
        int count=0;
        for(Staff staff:list){
            if(staff.getNumber().startsWith(p)){
                count++;
            }
        }
        int sum=sum(list,p);
        return (double) sum /count;
    }
}
