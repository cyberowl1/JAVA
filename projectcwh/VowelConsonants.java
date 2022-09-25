package com.example.projectcwh;
import java.util.Scanner;

public class VowelConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NAME : BHARTI NANDAN");
        System.out.println("Type character to  check whether vowel or consonants...");
        char c = sc.next().charAt(0);

        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(c + " is Vowel");
                break;
            default:
                System.out.println(c + " is Consonants");
        }


    }

}
