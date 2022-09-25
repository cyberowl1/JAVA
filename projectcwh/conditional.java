package com.example.projectcwh;
import  java.util.Scanner;


public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        if (age > 5)
        {
            System.out.println("greater than 6");
        }
        else
        {
            System.out.println("smaller than 6");
        }
    }
}
