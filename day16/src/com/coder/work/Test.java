package com.coder.work;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Staff staff=new Staff("李白", LocalDate.of(2018,2,4),8000);
        Staff staff1=new Staff("杜甫", LocalDate.of(2012,5,6),12000);
        Staff staff2=new Staff("白居易", LocalDate.of(2014,4,10),10000);
        Staff staff3=new Staff("陆游", LocalDate.of(2016,10,11),9000);
        Staff[] staffs=new Staff[]{staff,staff1,staff2,staff3};
        Enterprise enterprise=new Enterprise();
        enterprise.addSalary(staffs);
        enterprise.showStaff(staffs);
    }
}
