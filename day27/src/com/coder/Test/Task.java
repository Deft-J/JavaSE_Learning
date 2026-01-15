package com.coder.Test;

import java.io.*;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class Task {
    private static final String source = "d:/b/1.txt";
    private static final String dest = "d:/b/copied_1.txt";
    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(3);

    public static void main(String[] args) {
        scheduler.schedule(() -> {
            try {
                Files.copy(Paths.get(source), Paths.get(dest), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("文件已成功复制到D盘");
            } catch (IOException e) {
                System.err.println("文件复制失败: " + e.getMessage());
            }
        }, 2, TimeUnit.MINUTES);

        scheduler.schedule(() -> {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String currentTime = sdf.format(new Date());
            System.out.println("当前系统时间: " + currentTime);
        }, 30, TimeUnit.SECONDS);

        scheduler.scheduleAtFixedRate(() -> {
            File file = new File(dest);
            if (file.exists() && file.isFile()) {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    System.out.println("文件内容如下:");
                    String line;
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }
                    System.out.println("文件读取完成，程序退出");
                    scheduler.shutdown();
                    System.exit(0);
                } catch (IOException e) {
                    System.err.println("文件读取错误: " + e.getMessage());
                }
            } else {
                System.out.println("文件不存在，将在30秒后再次检测");
            }
        }, 1, 30, TimeUnit.SECONDS);
    }
}
