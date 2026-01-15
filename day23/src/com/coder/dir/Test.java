package com.coder.dir;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File[] files=File.listRoots();
        for (File file : files) {
            System.out.println(file);
            File[] files1 = file.listFiles();
            for (File file1 : files1) {
                long x=file1.lastModified();
                System.out.println("\t"+DateUtil.format(x));
                if (file1.isDirectory()) {
                    System.out.println("\t<DIR>");
                }
                else{
                    System.out.println("\t"+file.length());
                }
                System.out.println("\t"+file.getName());
            }
        }
    }

}
