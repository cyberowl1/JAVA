package com.example.projectcwh;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaevent  {
    public static void main(String[] args) {
        JFrame f = new JFrame("myFrame");
        JButton b = new JButton("click here");
        JTextField tf = new JTextField("hello ");
        tf.setBounds(100,100,200,180);
        b.setBounds(200,200,90,70);
        JButton bt = new JButton("for textbox");
        bt.setBounds(300,320,90,80);
        f.add(b);
        f.add(tf);
        f.add(bt);
        f.setSize(500, 500);
        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b.setText("clicked");
            }
        });
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("you have clicked textbox");
            }
        });
    }


    }