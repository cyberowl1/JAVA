package com.example.projectcwh;
import java.math.BigDecimal;
import java.math.BigInteger;

public class BigInteger1 {



    public static void main(String[] args) {
        BigInteger mod,x;
        x = new BigInteger("10");
        BigInteger a = new BigInteger("45");

        BigInteger b = BigInteger.valueOf(76L);
        BigInteger c =  BigInteger.TEN;
        System.out.println(c);
        System.out.println(b);
       BigInteger sum = a.add(b);
       BigInteger mul = a.multiply(c);
        System.out.println(sum);

        mod= a.modInverse(x);
        System.out.println(mul);
       System.out.println(mod);

        System.out.println(a);
        System.out.println(b.toString());

    }
}
