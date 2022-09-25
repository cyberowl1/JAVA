package com.example.projectcwh;



import javax.swing.*;
import java.awt.*;

public class GL2 {

    int x1=15,x2=10;
    public GL2() {
        JFrame frame = new JFrame("Basic Math Operation");
        frame.setLayout(new FlowLayout());
        JButton add = new JButton("Add");
        JButton subtract = new JButton("Subtract");
        JButton multiply = new JButton("Multiply");

        frame.add(add);
        add.setFocusable(false);
        add.addActionListener(e -> {
            System.out.println("Sum of 15 and 10 = "+(x1+x2) );
        });
        frame.add(subtract);
        subtract.setFocusable(false);
        subtract.addActionListener(e -> {
            System.out.println("Difference of 15 and 10 = "+(x1-x2) );
        });
        frame.add(multiply);
        multiply.setFocusable(false);
        multiply.addActionListener(e -> {
            System.out.println("Product of 15 and 10 = "+(x1*x2) );
        });
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GL2();
    }
}