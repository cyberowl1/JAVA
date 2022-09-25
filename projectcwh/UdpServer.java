package com.example.projectcwh;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpServer {
    public static void main(String[] args) throws IOException {
//create dadtagram socket

        DatagramSocket ds = new DatagramSocket(9999);
        System.out.println("waiting for client");
       byte [] b = new byte[100];
        DatagramPacket dp = new DatagramPacket(b,100);
        ds.receive(dp);
//        String dat = new String(b);
//        System.out.println(dat);
        ByteArrayInputStream bin = new ByteArrayInputStream(b);
        DataInputStream dout = new DataInputStream(bin);
        int a = dout.readInt();
        System.out.println(a*a);

        ds.close();



    }
}
