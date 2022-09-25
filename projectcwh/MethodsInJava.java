package com.example.projectcwh;




public class MethodsInJava {
    static int logic(int x , int y){
        if (x>y)
        {
            return x;
        }
        else
            return y;
    }


    public  static void main(String[] args) {
        int c = logic(12,6);
        System.out.println(c);

    }
}
