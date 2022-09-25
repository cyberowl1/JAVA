package com.example.projectcwh;

public class javaException {

        public static void main(String args[]){
            try{
                //code that may raise exce‹ption
                int data=100/0;
            }catch(ArithmeticException e){System.out.println(e);}
            //rest code of the program
            System.out.println("rest of the code...");
        }

    }
