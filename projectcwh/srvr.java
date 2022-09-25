package com.example.projectcwh;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class srvr {
    public static void main(String[] args) throws IOException {

        try {
            System.out.println("waiting for connection from client");
            ServerSocket ss = new ServerSocket(9802);
            Socket soc = ss.accept();
            System.out.println("connection established");
            DataInputStream din = new DataInputStream(soc.getInputStream());
          int radius = din.readInt();
          int res=1;
          for(int i=1;i<=radius;i++)
          {
              res = res * i;
          }
            DataOutputStream dout = new DataOutputStream(soc.getOutputStream());
            dout.writeInt(res);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
