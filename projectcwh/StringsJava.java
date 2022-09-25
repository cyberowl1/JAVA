package com.example.projectcwh;
import java.util.Locale;
import java.util.Scanner;

public class StringsJava {
    public static void main(String[] args) {
        System.out.println("naam");

        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String sr = sc.nextLine();
        System.out.println(st.toUpperCase());
        System.out.println(sr.toLowerCase());
        int n =  sr.length();
        System.out.println(n);
        String nonTrimmed = "     haryyyyyyyy   ";
        System.out.println(nonTrimmed.trim());
        System.out.println(nonTrimmed.substring(12));
    }
}
