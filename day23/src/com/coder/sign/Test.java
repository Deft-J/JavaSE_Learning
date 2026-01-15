package com.coder.sign;

import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("1.生成人员名单");
        System.out.println("2.生成签到表");
        System.out.println("3.生成缺席表");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1:
                List<String> nameList=File.getName();
                File.write(nameList,"d:/b/人员名单.txt");
                break;
            case 2:
                List<String> signList=File.getName();
                File.write(signList,File.getFileName("d:/b/","签到表"));
                break;
            case 3:
                List<String> nameList2=File.read("d:/b/人员名单.txt");
                List<String> signList2=File.read(File.getFileName("d:/b/","签到表"));
                nameList2.retainAll(signList2);
                File.write(nameList2,File.getFileName("d:/b/","缺席表"));
                break;
        }
    }
}
