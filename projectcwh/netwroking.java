package com.example.projectcwh;


import javax.swing.JOptionPane;

import java.net.*;



public class netwroking {



    public static void main(String[] args) throws UnknownHostException {



        String domain;

        String IP;

        String url = JOptionPane.showInputDialog(null, "Enter URL");

        try {

            InetAddress ip = InetAddress.getByName(url);

            domain = ip.getHostName();

            IP = ip.getHostAddress();

            JOptionPane.showMessageDialog(null, "Host name is : " + domain + "\nIP Adress is : " + IP);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null,"Unknown host or IP address");

        }

    }



}