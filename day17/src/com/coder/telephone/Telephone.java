package com.coder.telephone;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Telephone {
    public static String getNumber(Random rand) {
        String p="1";
        List<String> list=Arrays.asList("3","5","7","8","9");
        int index=rand.nextInt(list.size());
        return p+list.get(index)+getSuffix(rand);
    }

    private static String getSuffix(Random rand) {

        String s="";
        for (int i=0;i<9;i++){
            s+=rand.nextInt(10);
        }
        return s;
    }
}
