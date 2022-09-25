package com.example.projectcwh;

public class MethodOverloading {
    static void manip(String s, int p) {
        int length;
        String str = s;

        int num = p;
        if (p % 2 == 0) {
            for (int i = 0; i <= str.length(); i++) {
                if (i % 2 == 0) {
                    System.out.println(str.charAt(i));
                }

            }
        }

    }

    static void manip(int p, String s) {
        System.out.println("in 2nd function");
        String str = s;

        int num = p;
        if (num % 2 != 0) {
            for (int i = 0; i <= str.length(); i++) {
                if (i % 2 != 0) {
                    System.out.println(str.charAt(i));
                }

            }
        }

    }

    public static void main(String[] args) {
        manip("bharti", 4);
        
        manip(3, "bharti");

    }
}
