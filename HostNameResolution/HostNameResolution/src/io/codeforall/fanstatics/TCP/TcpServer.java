package io.codeforall.fanstatics.TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class TcpServer {
    public static void main(String[] args) throws IOException {

        //String host= "localhost";
        int localPort = 8080;

        //creating a server
        ServerSocket serverSocket = new ServerSocket(localPort);
        //server is now listening and waiting for a client
        Socket clientSocket = serverSocket.accept();
        //at this point a client has been connected
        System.out.println(clientSocket);


        // input and output streams
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));


        out.println("Connected");

        while (true) {
            String message = in.readLine();
            System.out.println(message);
        }












    }







}

