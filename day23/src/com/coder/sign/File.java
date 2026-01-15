package com.coder.sign;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class File {
    public static void write(List<String> names, String fileName) {
        try {
            java.io.File file = new java.io.File(fileName);
            java.io.File parentDir = file.getParentFile();
            if (parentDir != null && !parentDir.exists()) {
                parentDir.mkdirs();
            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (String name : names) {
                writer.write(name);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> read(String fileName) {
        List<String> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String name;
            while ((name = reader.readLine()) != null) {
                list.add(name);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static List<String> getName() {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.println("输入人员姓名，输入完毕后输入完成:");
        while (true) {
            String name = sc.nextLine();
            if ("完毕".equals(name)) {
                break;
            }
            list.add(name);
        }
        return list;
    }

    public static String getFileName(String dir, String s) {
        return s + ".txt";
    }
}