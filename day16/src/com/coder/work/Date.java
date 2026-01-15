package com.coder.work;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Date {
    public static int betweenMonth(LocalDate hireDate){
        LocalDate now=LocalDate.now();
        long months
                = ChronoUnit.MONTHS.between(hireDate, now);
        return (int) months;
    }
}
