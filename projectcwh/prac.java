package com.example.projectcwh;

public class prac {
    public static void main(String[]args)
    {
        System.out.println("Programmer: TANUL KHARE");
        float c =331; //CI
        float a =1331; //Amount
        float r =10; //
        float n =100; //Number of years
        float t =1 ; //Time to be find
        float p =1000; //Principle
        int count =0;
        //FORMULA : a = (((r/n)+1)*p)pow(t)
        float m = ((((r/n)+1)));
        double bn =Math.pow(m,t);
        float j = a/p;
        while(bn<=j)
        {
            ++count;
            bn =Math.pow(bn,t);
            t = ++t;
        }
        System.out.println("T is coming out as :"+count);
    }
}