package com.coder.copy;

import java.io.*;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class CopyFile {
    public static void main(String[] args) {
        Thread t1=new Thread(new FileCopyThread
                (new File("d:/b/签到表.txt"),new File("d:/b/签到表1.txt")));
        Thread t2=new Thread(new FileCopyThread
                (new File("d:/b/缺席表.txt"),new File("d:/b/缺席表1.txt")));
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}

class FileCopyThread implements Runnable {
    private File src;
    private File dst;
    public FileCopyThread(File src, File dst) {
        this.src = src;
        this.dst = dst;
    }

    @Override
    public void run() {
        FileUtil.copyFile(src, dst);
    }
}
class FileUtil{
    public static void copyFile(File src, File dest) {
        if(!src.exists()){
            try {
                throw new FileNotFoundException("File not found: " + src);
            }catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        byte[] buffer = new byte[1024];
        int x;
        double d=0;
        DecimalFormat format=new DecimalFormat("#0%");
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));
        ) {
            while ((x = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, x);
                d += x;
                double y = d / src.length();
                if (y != 1)
                    if (((int) (y * 10000)) % 500 == 0)
                        System.out.println("复制文件" + src.getName() + "进度:"
                                + format.format(y));
            }
            System.out.println(src.getName() + "复制完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}