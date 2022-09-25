package com.example.projectcwh;

public class PatternPrint {
    void PatterPrinter(int x, char ch)
    {
        int size = x;
        int num=0;
        if (ch == 'h' || ch == 'H')
        {
           for(int i = 0; i <size; i++) {
              for(int j = 0; j <= i; j++) {
                  System.out.print(size);
                   }
                System.out.print("  ");
            }
        }
    }

    void PatterPrinter(char ch, int x)
    {
        int size = x;
        int num=0;
        if (ch == 'r' || ch == 'R')
        {
            for(int i = 0; i <size; i++) {
                for(int j = 0; j <= i; j++) {
                    System.out.print(size);
                }
                System.out.println("");
            }
        }
    }
    public static void main(String[] args) {
        PatternPrint obj = new PatternPrint();
        obj.PatterPrinter(5, 'h');
        obj.PatterPrinter('R', 5);


    }
}
