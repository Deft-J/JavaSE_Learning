package com.coder.day;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Day {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate day=LocalDate.of(2004,12,27);
        long between = ChronoUnit.DAYS.between(day, today);
        System.out.println(between);
    }
}
