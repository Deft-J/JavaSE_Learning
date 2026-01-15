package com.coder.lottery;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type = 0;

        // 1. 修正输入类型问题：接收字符串并转换为数字
        System.out.println("选择彩票类型(3D/5D):");
        String typeStr = sc.next();
        if ("3D".equals(typeStr)) {
            type = 3;
        } else if ("5D".equals(typeStr)) {
            type = 5;
        }
        System.out.println("输入购买数量:");
        int quantity = sc.nextInt();

        File dir = new File("d:/b/");
        if (!dir.exists()) {
            dir.mkdirs();
        }

        List<List<String>> list = getNumber(type, quantity);
        String time = getTime();
        String code = getNum();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("d:/b/彩票.txt"))) {
            writer.write("购买时间:" + time);
            writer.newLine();
            writer.write("彩票流水号：" + code);
            writer.newLine();
            writer.write("彩票号码：");
            writer.newLine();

            for (List<String> numList : list) {
                for (String num : numList) {
                    writer.write(num + "\t");
                }
                writer.newLine();
            }
            System.out.println("文件已成功生成：d:/b/彩票.txt");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }

    public static List<List<String>> getNumber(int type, int quantity) {
        Random rand = new Random();
        List<List<String>> list = new ArrayList<>(quantity);
        for (int i = 0; i < quantity; i++) {
            List<String> list1 = new ArrayList<>(type);
            for (int i1 = 0; i1 < type; i1++) {
                list1.add(rand.nextInt(9) + 1 + "");
            }
            list.add(list1);
        }
        return list;
    }

    public static String getTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public static String getNum() {
        Random rand = new Random();
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            str.append(rand.nextInt(10));
        }
        return str.toString();
    }
}
