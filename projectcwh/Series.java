package com.example.projectcwh;

public class Series {

     void seriesA(int x, char ch) {
         int n = 100;
         int num = x;
         if (ch == 'i') {
             for (int j = num; j <= n; j++) {
                 System.out.println(j);
             }
         }

         else
         {
             System.out.println("wrong input");
         }
     }
     void seriesA(char ch, int x){
        int p = 0;
        int num = x;
        if (ch == 'd')
        {
            while(num != 0){
                System.out.println(num);
                num--;
            }
        }
    }
    public static void main(String[] args) {
            Series obj = new Series();
            obj.seriesA(8, 'i');
           obj.seriesA('d', 8);

        }

    }

