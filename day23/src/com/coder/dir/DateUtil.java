package com.coder.dir;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateUtil {
    public static String format(long timestamp){
        Date date=new Date(timestamp);
        ZonedDateTime zonedDateTime=date.toInstant().atZone(ZoneId.systemDefault());
        LocalDateTime localDateTime=zonedDateTime.toLocalDateTime();
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    }

}
