package com.example.projectcwh;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        try
        {
            Socket s= new Socket("139.167.169.39",9877);
//outoput
//            Scanner sc = new Scanner(System.in);
//            System.out.println("enter numbr to calculate factorial");
//            int radius = sc.nextInt();
//            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
//            dout.writeInt(radius);
//
//            DataInputStream din = new DataInputStream(s.getInputStream());
//            System.out.println(din.readInt());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
