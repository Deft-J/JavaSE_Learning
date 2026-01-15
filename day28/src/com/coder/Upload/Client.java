package com.coder.Upload;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 7777);
        Scanner sc = new Scanner(System.in);
        File file;

        while (true) {
            System.out.println("输入上传文件名:");
            String fileName = sc.nextLine();
            file = new File(fileName);
            if (file.exists()) {
                break;
            }
            System.out.println("文件不存在，请重新输入");
        }

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println(file.getName());
        out.flush();
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String a = in.readLine();

        if ("是".equals(a)) {
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            bis.close();
            fis.close();
            bos.flush();
            System.out.println("文件上传成功");
        } else {
            System.out.println("服务器拒绝上传，上传终止");
        }

        out.close();
        socket.close();
    }
}