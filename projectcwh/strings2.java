package com.example.projectcwh;
import javax.swing.*;



    public class strings2 {
    public static void main(String[] args) {
      String str1 = new String();
      str1 = JOptionPane.showInputDialog("ENTER FIRST STRING");

      String str2 = new String();
      str2 = JOptionPane.showInputDialog("ENter your second string");

      int i=0;
      while(str1.charAt(i)==str2.charAt(i))
      {
          if(str1.charAt(i)!=str2.charAt(i))
          {
              return;
          }
          i++;
      }
      JOptionPane.showMessageDialog(null, str1.substring(0,i));
    }

    }

