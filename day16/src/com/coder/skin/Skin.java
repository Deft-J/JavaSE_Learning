package com.coder.skin;

import java.time.LocalDate;

public class Skin {
    public int buy(LocalDate onLineDate,LocalDate buyDate){
        LocalDate firstWeek=onLineDate.plusDays(7);
        LocalDate secondWeek=onLineDate.plusDays(14);
        LocalDate fourthWeek=onLineDate.plusDays(28);
        int x=buyDate.compareTo(firstWeek);
        if (x<=0){
            return 8;
        } else{
            int y=buyDate.compareTo(secondWeek);
            if (y<=0){
                return 9;
            }else{
                int z=buyDate.compareTo(fourthWeek);
                if (z<=0){
                    return 10;
                }else{
                    return -1;
                }
            }
        }
    }
}
