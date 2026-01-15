package com.coder.admin;

public class Register {
    public static boolean userName(String userName) {
        char[] chars = userName.toCharArray();
        boolean a = true;
        for (char c : chars) {
            if (!Character.isLetter(c)) {
                a=false;
                break;
            }
        }
        return a;
    }
    public static boolean userPwd(String userPwd) {
        char[] chars = userPwd.toCharArray();
        boolean digit = false;
        boolean upper = false;
        boolean lower = false;
        for (char c : chars) {
            if (Character.isDigit(c)) {
                digit = true;
            }else if (Character.isUpperCase(c)) {
                upper = true;
            }else if (Character.isLowerCase(c)) {
                lower = true;
            }
        }return digit && upper && lower;
    }

}
