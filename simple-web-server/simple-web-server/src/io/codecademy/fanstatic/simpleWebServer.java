package io.codecademy.fanstatic;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class simpleWebServer {
    public static void main(String[] args) throws IOException {

        // criar port
        int port = 8080;

        //creating server
        System.out.println("Binding to port " + port);
        ServerSocket serverSocket = new ServerSocket(port);

        //server listening and waiting for a client
        System.out.println("Waiting for a client connection");
        Socket clientSocket = serverSocket.accept();

        // handle client connection
        System.out.println("Client accepted: " + clientSocket);


        //read and write stream
        //output
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);


        //input
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));


        String resourceRequested = in.readLine().split(" ")[1];
        System.out.println(resourceRequested);
        if (resourceRequested.equals("/") || resourceRequested.equals("/index.html")) {
            int size = 10000;
            out.println("HTTP/1.0 200 Document Follows\r\n" +
                    "Content-Type: text/html; charset=UTF-8\r\n" +
                    "Content-Length: " + size + "\r\n" +
                    "\r\n");


        } else if (resourceRequested.equals("/logo.png")) {

            out.println("HTTP/1.0 200 Document Follows\r\n" +
                    "Content-Type: image/<image_file_extension> \r\n" +
                    "Content-Length: <file_byte_size> \r\n" +
                    "\r\n");


        } else {

            out.println("HTTP/1.0 404 Not Found" +
                    "Content-Type: text/html; charset=UTF-8\r\n" +
                    "Content-Length: <file_byte_size> \r\n" +
                    "\r\n");
        }
    }
}
