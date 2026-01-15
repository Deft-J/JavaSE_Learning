package com.coder.staff;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataUtil {
    public static LocalDate parse(String str){
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(str,formatter);
    }
}
