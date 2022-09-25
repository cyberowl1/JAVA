package com.example.projectcwh;
import java.util.Scanner;


public class PercentageCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Percentage calculator");

        System.out.println("Enter obtained marks");
        float marks = sc.nextInt();
        System.out.println("Enter total marks");
        float total_marks = sc.nextInt();

        float prcnt = marks*100 / total_marks ;
        System.out.println(prcnt);
    }
}
