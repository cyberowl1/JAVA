package com.example.projectcwh;

import java.sql.Connection;
import java.sql.DriverManager;

public class jbdc {
    public static void main(String[] args)  {

        try
        {
//            NOT NEED NOW
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
            if(con!=null)
            {
                System.out.println("connection success");
            }
           String sql = "INSERT INTO ";
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
