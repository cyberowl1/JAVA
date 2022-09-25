package com.example.projectcwh;

import javax.swing.*;
import java.util.*;

public class Glab2 {
    public static void main(String[] args) {


        Vector<Integer> v1 = new Vector<Integer>();
        for(int i=0;i<10;i++)
        {
            int randomNumber = (int) (Math.random()*(100-1)) + 1;
//            System.out.println(randomNumber);
            v1.add(randomNumber);
        }

        Iterator<Integer> iter=v1.iterator();
        System.out.println("Before Sorting");
        System.out.println(v1);
        Collections.sort(v1);
        iter=v1.iterator();

        System.out.println("After  Sorting");
        System.out.println(v1);

        TreeSet<Integer> treeSet
                = new TreeSet<Integer>(v1);


        v1.clear();


        v1.addAll(treeSet);


        System.out.println(
                "After removing duplicate elements - ");
        System.out.println(v1);
    }


}
