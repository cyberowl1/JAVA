package com.company;

import java.sql.Connection;
import java.sql.DriverManager;

public class mypack {
    public static void main(String[] args)  {

        try
        {
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql//localhost:3306/user","root","root");
            System.out.println("connection success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

