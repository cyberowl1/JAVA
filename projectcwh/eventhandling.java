package com.example.projectcwh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class even extends Frame implements ActionListener{

    JTextField tf;
    even(){
        JButton b = new JButton("click here");
      tf= new JTextField();
        b.setBounds(500,500,80,40);
        tf.setBounds(500,200,100,120);
        add(b);add(tf);
        setVisible(true);
        setSize(1000,1000);

        b.addActionListener(this);

    }




    @Override
    public void actionPerformed(ActionEvent e) {
tf.setText("hey you are welcome here");
    }

}
public class eventhandling {
    public static void main(String[] args) {
new even();
    }
}
