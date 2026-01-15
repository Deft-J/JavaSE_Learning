package com.coder.zoo;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Tiger tiger = new Tiger(1.3,500);
        Tiger tiger1= (Tiger) tiger.clone();
        System.out.println(tiger);
        System.out.println(tiger1);
        System.out.println(tiger.equals(tiger1)?"通过检查":"未通过检查");

    }
}
