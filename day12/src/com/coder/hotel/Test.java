package com.coder.hotel;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String[] id1={"******************"};
        Scanner sc = new Scanner(System.in);
        System.out.println("输入身份证号码：");
        String id2 = sc.nextLine();
        if (id2.equals(id1[0])) {
            try{
                throw new IdException(id2+"异常，为在逃人员");
            }catch (IdException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println(id2+"入住成功");
        }
    }
}
