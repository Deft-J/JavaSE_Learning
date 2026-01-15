package com.coder.GuessGame;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("localhost",8888);
        InputStream isr=socket.getInputStream();
        BufferedReader in=new BufferedReader(new InputStreamReader(isr));
        PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("输入猜数：");
            int x=sc.nextInt();
            out.println(x);
            out.flush();
            String s=in.readLine();
            System.out.println(s);
            if(s.equals("成功猜对")){
                break;
            }
        }
        in.close();
        out.close();
    }
}
