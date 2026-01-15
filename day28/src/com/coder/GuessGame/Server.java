package com.coder.GuessGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket clientSocket = serverSocket.accept();
        Random rand = new Random();
        int a=rand.nextInt(100)+1;
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        boolean b=true;
        while(b){
            String s = in.readLine();
            int i=Integer.parseInt(s);
            if(a==i){
                out.println("成功猜对");
                out.flush();
                break;
            } else if (a > i) {
                out.println("猜小了");
            }else {
                out.println("猜大了");
            }
            out.flush();
        }
        in.close();
        out.close();
    }
}
