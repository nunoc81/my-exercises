package io.codeforall.fanstatics.UDP;

import java.net.*;

public class Udpserver {
    public static void main(String[] args) throws Exception{

        //Exercise
        // Implement UDP UPPERCASE server and client classes


    // datagram socket
    DatagramSocket serverSocket = new DatagramSocket(8080);
    String host= "localhost";

        // buffers
    byte[] receiveData = new byte[1024];
    byte[] sendData = new byte[1024];

    while (true) {
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        serverSocket.receive(receivePacket);

        String sentence = new String(receivePacket.getData());
        InetAddress address = InetAddress.getByName(host);

        int port = receivePacket.getPort();
        String capitalizedSentence = sentence.toUpperCase();
        sendData = capitalizedSentence.getBytes();

        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, address, port);
        serverSocket.send(sendPacket);
    }
    }

}