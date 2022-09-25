package com.example.projectcwh;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class udpclient {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        System.out.println("write a integer");
        int n = sc.nextInt();
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        DataOutputStream dout = new DataOutputStream(bout);
        dout.writeInt(n);
        byte [] b = bout.toByteArray();
        InetAddress ip = InetAddress.getByName("localhost");
        int len = b.length;
        DatagramPacket dp = new DatagramPacket(b,len,ip,9999);
        ds.send(dp);



    }
}
