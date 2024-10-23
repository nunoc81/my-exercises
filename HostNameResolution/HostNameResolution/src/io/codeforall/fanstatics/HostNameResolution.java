package io.codeforall.fanstatics;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostNameResolution {

    public static void main(String[] args) throws IOException {

        // step1
        String host= "localhost";
        int localPort = 8080;
        byte[] sendBuffer = new byte[1024];
        byte[] recvBuffer = new byte[1024];

        InetAddress address = InetAddress.getByName(host);


        DatagramSocket socket = new DatagramSocket(localPort, address);

        DatagramPacket receivePacket = new DatagramPacket(recvBuffer, recvBuffer.length);
        socket.receive(receivePacket);

        


        /*
        try {
            InetAddress address = InetAddress.getByName(host);
            System.out.println(address.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("erro");
            throw new RuntimeException(e);

        }
         */


    }

}
